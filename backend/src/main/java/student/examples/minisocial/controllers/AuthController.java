package student.examples.minisocial.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import student.examples.minisocial.domain.entities.User;
import student.examples.minisocial.services.AuthService;

@RestController
public class AuthController {

	@Autowired
	AuthService authService;
	
	@PostMapping(value="/login",produces = "application/json")
	public Map<String,?> login(@RequestBody JsonNode node) {
          String nickName = node.get("nickName").asText();
          String password = node.get("password").asText();
          
          Map<String, Boolean> map = new HashMap<String, Boolean>();
          
          map.put("succes ", authService.login(nickName, password));
          return map;
	}
	
	@PostMapping("/register")
	public Map<String,?> register(@RequestBody User newUser){
		 Map<String, Boolean> map = new HashMap<String, Boolean>();
		 map.put("succes ", authService.register(newUser));
		 return map;
	}
	
	@GetMapping("/logout")
	public Map<String,?>logout() {
		 Map<String, Boolean> map = new HashMap<String, Boolean>();
		 map.put("succes ", authService.logout());
		 return map;
	}
}
