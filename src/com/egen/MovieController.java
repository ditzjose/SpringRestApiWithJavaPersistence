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
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private MovieService mService;
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<MoveTable> findAllmovie()
	{
		return mService.findAllMovie();
	}
	
	@RequestMapping(value = "{list_Title}" ,method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public MoveTable  findOne(@PathVariable("list_Title") String list_Title ) throws  MovieNotFoundException 
	{
		return mService.findOneMovie(list_Title);
	}
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public MoveTable create(@RequestBody MoveTable movie) throws BadRequestOnMovie
	{
		return mService.createMovie(movie);
	}
	@RequestMapping(value = "{list_Title}" , method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public MoveTable update(@PathVariable("list_Title") String list_Title ,@RequestBody MoveTable movie) throws MovieNotFoundException
	{
		return mService.update(list_Title, movie);
	}
	@RequestMapping(value = "{list_Title}" , method=RequestMethod.DELETE,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public MoveTable delete(@PathVariable("list_Title") String list_Title) throws  MovieNotFoundException
	{
		return mService.delete(list_Title);
	}
	
}
