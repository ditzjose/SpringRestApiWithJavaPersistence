package com.egen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishListService {

	@Autowired
	private WishListDAO wishListDAO;
	
	public List<WishList> findAll()
	{
		List<WishList>  wishList =  wishListDAO.findAll();
		 return wishList;
	}
	public WishList  findOne(String id ) throws UserNotFoundException 
	{
		WishList wishList = wishListDAO.findOne(id);
		if(wishList != null)
		{
			return wishList;
		}
		else
		{
			throw new UserNotFoundException();
		}
	}
	public List<WishList> findMovieTitle(String userId ) throws UserNotFoundException 
	{
		List<WishList> wishList = wishListDAO.findMovieTitle(userId);
		return wishList;
		
	}
	public WishList createUser(WishList wishList) throws BadRequestByUser
	{
		wishList.setId(wishList.hashCode()+"");
			
		wishListDAO.createUser(wishList);
			return wishList;	
	}
	
	public WishList update( String id ,WishList wishList) throws UserNotFoundException
	{
		WishList wish1 = wishListDAO.findOne(id);
		if(wish1 != null)
		{
			return wishListDAO.update(wishList);
		}
		else
		{
			throw new UserNotFoundException();
		}
	}
	public WishList delete(String id ) throws UserNotFoundException
	{
		WishList wish1 = wishListDAO.findOne(id);
		if(wish1 != null)
		{
			return wishListDAO.delete(id);
		}
		else
		{
			throw new UserNotFoundException();
		}
	}
}
