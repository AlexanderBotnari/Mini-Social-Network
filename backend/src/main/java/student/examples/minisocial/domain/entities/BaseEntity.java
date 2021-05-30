package student.examples.minisocial.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import student.examples.minisocial.domain.entities.interfaces.IsChronological;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name = "type" , discriminatorType = DiscriminatorType.STRING)
public abstract class BaseEntity implements IsChronological{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@CreationTimestamp
	private LocalDateTime created;
	
	@UpdateTimestamp
	private LocalDateTime updated;	

	private LocalDateTime deleted;
	
	@Column(name = "type", insertable = false, updatable = false)
	private String type;
	
	
}
