package com.egen;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserOrderDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<UserOrder> findall(){
		
    TypedQuery<UserOrder> query1 = entityManager.createQuery("SELECT u FROM UserOrder u", UserOrder.class); 
		List<UserOrder> OrderList = query1.getResultList();
	    return OrderList;
	
	}  
	
	
	public UserOrder addMovieToOrder(String UserId,String movieTitle ){
		
		UserOrder order=findOrder(UserId);
		order.setTitle(movieTitle);
		entityManager.merge(order);
		return order;
		
	}
	
	public UserOrder findOrder(String OrderID){
		
		TypedQuery<UserOrder> query1 = entityManager.createQuery("SELECT u FROM UserOrder u where u.OrderID='"+OrderID+"'", UserOrder.class); // User is case sensitive
		UserOrder order = (UserOrder) query1.getResultList();
		return order;
	}
	
	public UserOrder removeMovieFromOrder(String userId,String movieTitle){
		UserOrder order=findOrder(userId);
	    order.setTitle(null);
		entityManager.merge(order);
		return order;
	}
	
	
	public UserOrder createOrder(UserOrder order)
	{
		entityManager.persist(order);
	   return order;
	}
	
	public UserOrder deleteOrder(String userid){
		UserOrder order =  entityManager.find(UserOrder.class, userid);
		entityManager.remove(order);
		return order;
	}
	
	public List<UserOrder> showOrders(String userID){
		 TypedQuery<UserOrder> query1 = entityManager.createQuery("SELECT u FROM UserOrder u where u.userID='"+userID+"'", UserOrder.class); 
		
			List<UserOrder> OrderList = query1.getResultList();
		return OrderList;
		}
	
}
