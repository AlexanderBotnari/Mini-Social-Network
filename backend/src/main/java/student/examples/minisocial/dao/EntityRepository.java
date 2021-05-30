package student.examples.minisocial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.examples.minisocial.domain.entities.BaseEntity;


@Repository
public interface EntityRepository<T extends BaseEntity> extends JpaRepository<T, Integer>{

	public List<T> findAllByType(String type);
	
}
