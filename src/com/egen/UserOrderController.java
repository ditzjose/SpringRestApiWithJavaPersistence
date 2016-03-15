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
@RequestMapping("/order")
public class UserOrderController {
	
	@Autowired
	private UserOrderService orderService;
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserOrder> findall(){
	 return orderService.findall();	
		
	}
	
	
	@RequestMapping(value = "{id}" ,method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public UserOrder findOrder(@PathVariable("id") String id)throws UserNotFoundException{
		
     return orderService.findOrder(id);
	}
	
	@RequestMapping(value = "{id,}/{Title}" , method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserOrder addMovieToOrder(@PathVariable("id") String id,@PathVariable("Title") String Title  ,@RequestBody MoveTable movie) throws UserNotFoundException{
		
		return orderService.addMovieToOrder(id, Title);
		
	}
	@RequestMapping(value = "{id}" , method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserOrder removeMovieFromOrder(@PathVariable("id") String id ) throws UserNotFoundException{
		return orderService.deleteOrder(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserOrder createOrder(@RequestBody UserOrder order) throws UserNotFoundException{
		return orderService.createOrder(order);
		
	}
	@RequestMapping(value = "{id}" , method=RequestMethod.DELETE,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserOrder deleteOrder(@PathVariable("id") String id ) throws UserNotFoundException{
		
		return orderService.deleteOrder(id);
	}
	
//	@RequestMapping(value = "{id}" , method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//	public List<UserOrder> showOrder(@PathVariable("id") String id ) throws UserNotFoundException{
//		
//		return orderService.showOrder(id);
//	}

}
