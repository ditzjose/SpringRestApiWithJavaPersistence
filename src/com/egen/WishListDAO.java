package com.egen;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class WishListDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<WishList> findAll()
	{
		TypedQuery<WishList> query1 = entityManager.createQuery("SELECT u FROM WishList u", WishList.class); // User is case sensitive
		List<WishList> wishList = query1.getResultList();
		 return wishList;
	}
	
	public List<WishList> findMovieTitle(String userId)
	{
		TypedQuery<WishList> query1 = entityManager.createQuery("SELECT u FROM WishList u where u.userId='"+userId+"'", WishList.class); // User is case sensitive
		List<WishList> wishList = query1.getResultList();
		 return wishList;
	}
	
	public WishList  findOne(String id )  
	{
		return entityManager.find(WishList.class, id);
	}
	
	public WishList createUser(WishList wishList) 
	{
		
		entityManager.persist(wishList);
		return wishList;
		
	}
	
	public WishList update(WishList wishList) 
	{
		
		return entityManager.merge(wishList);
	}
	public WishList delete(String id ) 
	{
		WishList wishList =  entityManager.find(WishList.class, id);
		entityManager.remove(wishList);
		return wishList;
	}
	
}
