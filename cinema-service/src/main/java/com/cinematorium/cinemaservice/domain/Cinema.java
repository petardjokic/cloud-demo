package com.cinematorium.cinemaservice.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
	private Long id;
	private String name;
	private String location;
}
