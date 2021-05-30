package student.examples.minisocial.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.examples.minisocial.dao.EntityRepository;
import student.examples.minisocial.domain.entities.BaseEntity;

@Service
public class EntityService<T extends BaseEntity> {

	@Autowired
	private EntityRepository<T> repository;

	public List<T> all(){
		return repository.findAll();
	}
	public List<T> allByType(String type){
		return repository.findAllByType(type);
	}
	
	public T find(Integer id){
		return (T) repository.findById(id).get();
	}
	
	public T save (T entity) {
		repository.save(entity);
		return entity;
	}
	
	public T delete(Integer id) {
	    T entity = repository.findById(id).get();
	    repository.delete(entity);
	    return entity;
	}
	
	public T delete(T entity) {
		T entityFromDb = repository.findById(entity.getId()).get();
	    repository.delete(entity);
	    return entityFromDb;
	}
	
}
