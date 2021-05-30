package student.examples.minisocial.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.examples.minisocial.dao.UserRepository;
import student.examples.minisocial.domain.entities.User;

@Service
public class AuthService {

	@Autowired
	public UserRepository userRepository;
		
	public Boolean login(String nickName, String password) {
		Optional<User> user = userRepository.findByNickNameAndPassword(nickName, password);
		
		if(user.isPresent()) {
			System.err.println(user.get().toString());
			return true;
		}else {
			System.err.println("Incorect password or nick name!");
			return false;
		}
	}
	
	public Boolean register(User newUser){
		Optional<User> user = userRepository.findByNickName(newUser.getNickName());
		
		if(user.isPresent()) {
			System.err.println("User Already exists!");
            return false;
		}else {
			userRepository.save(newUser);
	        return true;
		}
	}
	
	public Boolean logout() {
		return true;
	}
}
