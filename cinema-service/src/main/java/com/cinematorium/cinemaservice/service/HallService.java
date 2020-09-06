package com.cinematorium.cinemaservice.service;

import java.util.List;

import com.cinematorium.cinemaservice.domain.Hall;

public interface HallService {
	
	public Hall getById(Long hallId);
	
	public List<Hall> getHallsByCinema(Long cinemaId);
}
