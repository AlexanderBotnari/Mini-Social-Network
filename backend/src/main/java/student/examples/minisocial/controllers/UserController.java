package student.examples.minisocial.controllers;
import org.springframework.web.bind.annotation.*;

import student.examples.minisocial.domain.entities.User;

@RestController
@RequestMapping("users")
public class UserController extends BaseRESTController<User>{
	
}