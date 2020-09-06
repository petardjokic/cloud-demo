package com.cinematorium.cinemaservice.service;

import java.util.List;

import com.cinematorium.cinemaservice.domain.Projection;
import com.cinematorium.cinemaservice.domain.ProjectionEager;

public interface ProjectionService {
	public List<ProjectionEager> getByCinemaId(Long cinemaId);
}
