package student.examples.minisocial.domain.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import student.examples.minisocial.domain.entities.enums.RelationState;
import student.examples.minisocial.domain.entities.enums.RelationType;

@Entity
@Data
@AllArgsConstructor
public class Relation {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    @CreationTimestamp
	private LocalDateTime created;
	
    @UpdateTimestamp
	private LocalDateTime modified;
	
	@Enumerated
	private RelationType type;
	@Enumerated
	private RelationState state;
//	
//	@ManyToOne
//	private User fromProfile;
//	@ManyToOne
//	private User toProfile;
}
