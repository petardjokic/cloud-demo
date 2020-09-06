package com.cinematorium.cinemaservice.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cinematorium.cinemaservice.domain.Seat;
import static com.cinematorium.cinemaservice.domain.SeatType.*;
import com.cinematorium.cinemaservice.service.SeatService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SeatServiceImpl implements SeatService{
	private List<Seat> list;
	
	public SeatServiceImpl() {
		log.info("Seat service bean created");
		list = Arrays.asList(new Seat(1L, 1L, 1, 1, CLASSIC),new Seat(2L, 1L, 1, 2, CLASSIC),
				new Seat(3L, 2L, 1, 1, VIP), new Seat(4L, 2L, 1, 2, VIP), new Seat(5L, 2L, 1, 3, CLASSIC),
				new Seat(6L, 3L, 1, 1, LOVE), new Seat(7L, 3L, 1, 2, LOVE));
	}

	@Override
	public List<Seat> getSeatsForHall(Long hallId) {
		return list.parallelStream().filter(seat -> seat.getHallId().equals(hallId)).collect(Collectors.toList());
	}
	
}
