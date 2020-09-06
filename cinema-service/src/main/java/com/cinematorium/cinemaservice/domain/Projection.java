package com.cinematorium.cinemaservice.domain;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Projection {
	
	private Long id;
	private Long movieId;
	private Long hallId;
	private Long cinemaId;
	private LocalDateTime startTime;
}
