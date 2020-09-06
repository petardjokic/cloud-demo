package com.cinematorium.cinemaservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
	private Long id;
	private Long hallId;
	private Integer row;
	private Integer column;
	private SeatType seatType;
}
