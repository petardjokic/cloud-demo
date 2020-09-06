package com.cinematorium.projectionservice.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinematorium.projectionservice.domain.Projection;
import com.cinematorium.projectionservice.service.ProjectionService;

@RestController
@RequestMapping(value = "/api")
public class ProjectionApi {

	private ProjectionService projectionService;
	
	public ProjectionApi(ProjectionService projectionService) {
		this.projectionService = projectionService;
	}
	
	@GetMapping(value = "/projections/{cinemaId}")
	public List<Projection> getProjectionsForCinema(@PathVariable Long cinemaId) {
		return projectionService.getProjectionsByCinemaId(cinemaId);
	}
}
