package student.examples.minisocial.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.examples.minisocial.domain.entities.Comment;
import student.examples.minisocial.responses.JSONResponse;
import student.examples.minisocial.responses.enums.ResponseStatus;
import student.examples.minisocial.services.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController extends BaseRESTController<Comment>{

//	@Autowired
//	CommentService commentService;
//
//    @GetMapping("")
//    public JSONResponse index(){
//        return new JSONResponse(ResponseStatus.SUCCES,commentService.findAllComments());
//    }
}
