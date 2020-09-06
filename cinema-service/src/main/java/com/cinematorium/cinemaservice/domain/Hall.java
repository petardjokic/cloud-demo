package com.cinematorium.cinemaservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hall {
	private Long id;
	private Long cinemaId;
	private String name;
}
