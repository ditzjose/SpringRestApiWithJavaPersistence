package com.egen;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wishlist")
public class WishListController {

	@Autowired
	private WishListService wishService;
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<WishList> findAll()
	{
		return wishService.findAll();
	}
	@RequestMapping(value = "{id}" ,method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public WishList  findOne(@PathVariable("id") String id ) throws UserNotFoundException 
	{
		return wishService.findOne(id);
	}
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public WishList create(@RequestBody WishList wishList) throws BadRequestByUser
	{
		return wishService.createUser(wishList);
	}
	@RequestMapping(value = "{id}" , method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public WishList update(@PathVariable("id") String id ,@RequestBody WishList wishList) throws UserNotFoundException
	{
		return wishService.update(id, wishList);
	}
	@RequestMapping(value = "{id}" , method=RequestMethod.DELETE,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public WishList delete(@PathVariable("id") String id ) throws UserNotFoundException
	{
		return wishService.delete(id);
	}
}
