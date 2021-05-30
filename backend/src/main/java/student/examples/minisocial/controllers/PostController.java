package student.examples.minisocial.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.examples.minisocial.domain.entities.Post;

@RestController
@RequestMapping("/posts")
public class PostController extends BaseRESTController<Post>{

}
