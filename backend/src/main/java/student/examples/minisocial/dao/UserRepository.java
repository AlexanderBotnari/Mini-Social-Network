package student.examples.minisocial.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.examples.minisocial.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

//	@Query(value="select * from profile where nick_name= ?1 and password= ?2",nativeQuery=true)
	public Optional<User> findByNickNameAndPassword(String nickName,String password);
	
//	@Query(value="select * from profile where nick_name= ?1",nativeQuery=true)
	public Optional<User> findByNickName(String nickName);
}