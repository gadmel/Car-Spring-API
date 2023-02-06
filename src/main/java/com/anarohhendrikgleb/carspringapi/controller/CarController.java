package com.anarohhendrikgleb.carspringapi.controller;

import com.anarohhendrikgleb.carspringapi.Car;
import com.anarohhendrikgleb.carspringapi.repository.CarRepository;
import com.anarohhendrikgleb.carspringapi.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carsApi")
public class CarController {
	CarService carService = new CarService();
	CarRepository carRepository= new CarRepository();

	@PostMapping("post")
	public Car post(@RequestBody Car incomingCarString ) {
		return carService.addCar(incomingCarString);
	}

	@DeleteMapping("delete")
	public List<Car> deleteCar(@RequestParam String id){
		carService.deleteCar(id);
		return carService.getCars();
	}

	@PutMapping("putCar/{id}")
	public String put(@RequestBody Car newCar, @PathVariable String id){
		carService.deleteCar(id);
		CarRepository.addCar(newCar);
		return newCar.toString();
	}


}
