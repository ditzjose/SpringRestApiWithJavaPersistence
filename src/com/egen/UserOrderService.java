package com.egen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOrderService {

	@Autowired
	private UserOrderDAO orderDao;
	
	public List<UserOrder> findall(){
		
		 List<UserOrder> orderList=orderDao.findall();
		 return orderList;
	}
	
	
	public UserOrder findOrder(String orderID)throws UserNotFoundException{
		
		UserOrder order=orderDao.findOrder(orderID);
		if(order!=null){
			return order;
		}
		else
		{
			throw new UserNotFoundException();
		}
		
		
	}

	public UserOrder addMovieToOrder(String UserId,String movieTitle) throws UserNotFoundException{
		
		UserOrder order=orderDao.addMovieToOrder(UserId, movieTitle);
		if(order!=null){
			return order;
		}
		else
		{
			throw new UserNotFoundException();
		}
	}
	
	public UserOrder removeMovieFromOrder(String userId,String movie) throws UserNotFoundException{
		
		
		UserOrder order=orderDao.removeMovieFromOrder(userId,movie);
		if(order!=null){
			return order;
		}
		else
		{
			throw new UserNotFoundException();
		}
		
	}
	
	public UserOrder createOrder(UserOrder order) throws UserNotFoundException{
		
		UserOrder order1=orderDao.createOrder(order);
		if(order1!=null){
			return order1;
		}
		else
		{
			throw new UserNotFoundException();
		}
		
	}
	public UserOrder deleteOrder(String userid) throws UserNotFoundException{
		
		UserOrder order1=orderDao.deleteOrder(userid);
		if(order1!=null){
			return order1;
		}
		else
		{
			throw new UserNotFoundException();
		}
		
		
	}
 public List<UserOrder> showOrder(String userid) throws UserNotFoundException{
		
		List<UserOrder> order1=orderDao.showOrders(userid);
		if(order1!=null){
			return order1;
		}
		else
		{
			throw new UserNotFoundException();
		}
		
		
	}
	
	
	
	
}
