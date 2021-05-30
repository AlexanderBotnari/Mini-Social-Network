package student.examples.minisocial.domain.entities;

import student.examples.minisocial.domain.entities.interfaces.HasAuthor;
import student.examples.minisocial.domain.entities.interfaces.HasSentiment;
import student.examples.minisocial.domain.entities.interfaces.IsChronological;
import student.examples.minisocial.domain.entities.interfaces.IsCommentable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends BaseEntity implements IsCommentable, IsChronological, HasSentiment, HasAuthor {

 //   @Column(length = 150)
      private String body;
    
    
//    	ASSOCIATIONS
 //   @ManyToOne()
//    private Post post;

}