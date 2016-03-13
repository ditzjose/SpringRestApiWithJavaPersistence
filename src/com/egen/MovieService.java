package com.egen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	MovieDAO movieDAO;

	public List<MoveTable> findAllMovie() {
		List<MoveTable> movies = movieDAO.findAllMovie();
		return movies;
	}

	public MoveTable findOneMovie(String list_Title)
			throws MovieNotFoundException {
		MoveTable movie = movieDAO.findOneMovie(list_Title);
		if (movie != null) {
			return movie;
		} else {
			throw new MovieNotFoundException();
		}
	}

	public MoveTable createMovie(MoveTable movie) throws BadRequestOnMovie {
		movieDAO.createMovie(movie);
		return movie;

	}

	public MoveTable update(String list_Title, MoveTable movie)
			throws MovieNotFoundException {
		MoveTable movie1 = movieDAO.findOneMovie(list_Title);
		if (movie1 != null) {
			return movieDAO.update(movie);
		} else {
			throw new MovieNotFoundException();
		}
	}

	public MoveTable delete(String list_Title) throws MovieNotFoundException {
		MoveTable movie1 = movieDAO.findOneMovie(list_Title);
		if (movie1 != null) {
			return movieDAO.delete(list_Title);
		} else {
			throw new MovieNotFoundException();
		}
	}
}
