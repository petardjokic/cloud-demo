package com.cinematorium.cinemaservice.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cinematorium.cinemaservice.domain.Cinema;
import com.cinematorium.cinemaservice.service.CinemaService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CinemaServiceImpl implements CinemaService {

	private List<Cinema> list;

	public CinemaServiceImpl() {
		log.info("Cinema service bean created");
		list = Arrays.asList(new Cinema(1L, "BIG Fashion", "Karaburma"), new Cinema(2L, "Delta", "Beograd"));
	}

	@Override
	public Cinema getById(Long id) {
		return list.parallelStream().filter(cinema -> cinema.getId().equals(id)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Invalid ID"));
	}

}
