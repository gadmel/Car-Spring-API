package com.anarohhendrikgleb.carspringapi;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
	private String id;
	private String manufacturer;
	private int tiresNumber;
	boolean hasTUEV;
}

