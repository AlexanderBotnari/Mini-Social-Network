package student.examples.minisocial.domain.entities;

import student.examples.minisocial.domain.entities.interfaces.HasAuthor;
import student.examples.minisocial.domain.entities.interfaces.IsChronological;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Message implements HasAuthor, IsChronological {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String body;
    
    
//    ASSOCIATIONS
    
//    @ManyToOne()
//    private User author;   // who sent the message
//    
//    // message -> UserB
//    @ManyToOne()
//    private User receiver;
}









/*
  Post  -------- mappedBy --    (virtual relation/inverse)
     id <<<<<<<            V
	 ...        ^          V
	            ^          V
  Comment       ^          V 
     id         ^          V
     ...        ^          V
     post_id >>>^    (id is saved HERE)
         <<<<<<<<<<<<<<<<<<

*/















