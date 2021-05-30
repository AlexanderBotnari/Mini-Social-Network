package student.examples.minisocial.domain.entities;
import student.examples.minisocial.domain.entities.interfaces.IsCommentable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="Profile")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity implements IsCommentable {

    @Column(unique = true, length = 25)
    private String nickName;
    @Column(length = 25)
    private String password;
    @Column(unique = true, length = 50)
    private String email;
    private String avatar;

//    RELATIONSHIPS / ASSOCIATIONS
    
    
    // friendship, follow, block, ... - same principle !!!
    
    // friends that THIS USER ADDED !!! - direct
//    @ManyToMany()
//    private List<User> friendTo = new ArrayList<>();
    
    // riends that added this user !!! - reverse - virtual
//    @ManyToMany(mappedBy = "friendTo")
//    private List<User> friendOf = new ArrayList<>();
    
    // actions > User -- cascateTO --> Post
//	@OneToMany(
//			mappedBy = "author",
//			cascade = CascadeType.REMOVE, 
//			orphanRemoval = true)
//	private List<Post> posts = new ArrayList<>();
//    
//	@OneToMany(
//			mappedBy = "author"
//	)
//	private List<Message> sentMessages = new ArrayList<>();
//	
//	@OneToMany(
//			mappedBy = "receiver"
//	)
//	private List<Message> receivedMessages = new ArrayList<>();

    public User(String nickName, String password, String email) {
        this.nickName = nickName;
        this.password = password;
        this.email = email;
    }
    
    public User(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

}




/*
profile
   ( id .... nick_name .... ) 
     1 ....  User1
     2 ....  User2
     3 ....  User3
     4 ....  User4
     5 ....  User5
 
 
profile_friend_to
   ( profile_of_id  profile_to_id )
  	  1      ->      2
  	  1      ->      3
  	  
  	  

User2  ->  reverse  ->  User1 -> direct -> User2 .... 	  
  	  
  	  
  	  
  */






















