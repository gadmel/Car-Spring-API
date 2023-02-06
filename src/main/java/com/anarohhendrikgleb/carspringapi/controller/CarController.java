package com.anarohhendrikgleb.carspringapi.controller;

import com.anarohhendrikgleb.carspringapi.Car;
import com.anarohhendrikgleb.carspringapi.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carsApi")
public class CarController {
	CarService carService = new CarService();

	@PostMapping("post")
	public Car post(@RequestBody Car incomingCarString ) {
		return carService.addCar(incomingCarString);
	}

	@DeleteMapping("delete")
	public List<Car> deleteCar(@RequestParam String id){
		carService.deleteCar(id);
		return carService.getCars();
	}

}
