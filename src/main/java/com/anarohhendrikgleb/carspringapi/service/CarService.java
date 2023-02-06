package com.anarohhendrikgleb.carspringapi.service;

import com.anarohhendrikgleb.carspringapi.Car;
import com.anarohhendrikgleb.carspringapi.repository.CarRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class CarService {
	CarRepository carRepository=new CarRepository();

	public Car addCar(Car newCar) {
		String randomId = UUID.randomUUID().toString();
		newCar.setId(randomId);
		System.out.println("The Car Service has saved a new car with ID " + newCar.getId() + ".");
		Car updatedCar = carRepository.addCar(newCar);
		return updatedCar;
	}

	public List<Car> getCars() {
		List<Car> cars = CarRepository.getCars();
		return cars;
	}

	public void deleteCar(String id){
		try {CarRepository.deleteCar(id);}
		catch (Exception e){
			System.out.println("The Car Service has not found a car with ID " + id + ".");
		} finally {
			System.out.println("The Car Service has deleted a car with ID " + id + ".");
		}
	}

}
