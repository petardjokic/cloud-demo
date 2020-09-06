package com.cinematorium.cinemaservice.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectionEager {
	private Long id;
	private LocalDateTime startTime;
	private Movie movie;
	private Hall hall;
	
}
