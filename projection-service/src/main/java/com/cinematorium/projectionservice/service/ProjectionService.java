package com.cinematorium.projectionservice.service;

import java.util.List;

import com.cinematorium.projectionservice.domain.Projection;

public interface ProjectionService {
	public List<Projection> getProjectionsByCinemaId(Long cinemaId);
}
