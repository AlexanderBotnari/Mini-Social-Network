package student.examples.minisocial.domain.entities;

import student.examples.minisocial.domain.entities.interfaces.HasAuthor;
import student.examples.minisocial.domain.entities.interfaces.HasSentiment;
import student.examples.minisocial.domain.entities.interfaces.IsChronological;
import student.examples.minisocial.domain.entities.interfaces.IsCommentable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post extends BaseEntity implements HasAuthor, HasSentiment, IsCommentable, IsChronological {
    
    private String title;
    private String body;
    
//    ASSOCIATIONS
    
//    @ManyToOne
//	@JoinColumn()
//	private User author;
//    
////    @OneToMany(mappedBy = "post")  // reverse
////    private List<Comment> comments = new ArrayList<>();
//    
//    @OneToMany(mappedBy = "post")  // reverse
//    private List<Sentiment> sentiments = new ArrayList<>();

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















