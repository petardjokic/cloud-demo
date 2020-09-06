package com.cinematorium.movieservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinematorium.movieservice.domain.Movie;
import com.cinematorium.movieservice.service.MovieService;

@RestController
@RequestMapping(value = "/api")
public class MovieApi {
	
	private MovieService movieService;
	
	public MovieApi(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping(value = "/movies/{id}")
	public Movie getMovieById(@PathVariable Long id) {
		return movieService.getById(id);
	}
}
