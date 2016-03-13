package com.egen;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MovieDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public List<MoveTable> findAllMovie() {
		TypedQuery<MoveTable> query1 = entityManager.createQuery(
				"SELECT u FROM MoveTable u", MoveTable.class); // User is case
															// sensitive
		List<MoveTable> movielist = query1.getResultList();
		return movielist;
	}

	public MoveTable findOneMovie(String list_Title) {

		return entityManager.find(MoveTable.class, list_Title);

	}

	public MoveTable createMovie(MoveTable movie) {

		entityManager.persist(movie);
		return movie;
	}

	public MoveTable update(MoveTable movie) {
		return entityManager.merge(movie);
	}

	public MoveTable delete(String list_Title) {
		MoveTable movie = entityManager.find(MoveTable.class, list_Title);
		entityManager.remove(movie);
		return movie;
	}

}
