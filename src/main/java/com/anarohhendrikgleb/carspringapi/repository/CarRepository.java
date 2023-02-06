package com.anarohhendrikgleb.carspringapi.repository;
import com.anarohhendrikgleb.carspringapi.Car;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
	private static List<Car> cars = new ArrayList<>();

	public static List<Car> getCars() {
		return cars;
	}

	public static Car addCar(Car car) {
		cars.add(car);
		return car;
	}

	public static void deleteCar(String id){
		cars.removeIf(car -> car.getId().equals(id));
	}


}
