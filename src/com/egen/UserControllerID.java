package com.egen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userId")
public class UserControllerID {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "{password}" ,method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User>   findId(@PathVariable("password") String password ) throws UserNotFoundException 
	{
		return service.findId(password);
	}

}
