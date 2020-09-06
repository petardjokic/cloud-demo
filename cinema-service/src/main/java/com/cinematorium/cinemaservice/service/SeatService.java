package com.cinematorium.cinemaservice.service;

import java.util.List;

import com.cinematorium.cinemaservice.domain.Seat;

public interface SeatService {
	public List<Seat> getSeatsForHall(Long hallId);
}
