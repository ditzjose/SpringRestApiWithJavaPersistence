package com.egen;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;




@Repository
@Transactional
public class UserDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<User> findAll()
	{
		TypedQuery<User> query1 = entityManager.createQuery("SELECT u FROM User u", User.class); // User is case sensitive
		List<User> userslist = query1.getResultList();
		 return userslist;
	}
	
	public List<User> findId(String password)
	{
		TypedQuery<User> query1 = entityManager.createQuery("SELECT u FROM User u where u.password='"+password+"'", User.class); // User is case sensitive
		List<User> userslist = query1.getResultList();
		 return userslist;
	}
	
	public User  findOne(String id )  
	{
		return entityManager.find(User.class, id);
	}
	
	public User createUser(User user) 
	{
		
		entityManager.persist(user);
		return user;
		
	}
	
	public User update(User user) 
	{
		
		return entityManager.merge(user);
	}
	public User delete(String id ) 
	{
		User user =  entityManager.find(User.class, id);
		entityManager.remove(user);
		return user;
	}
	
}
