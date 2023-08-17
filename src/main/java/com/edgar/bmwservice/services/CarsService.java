package com.edgar.bmwservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.bmwservice.models.Cars;
import com.edgar.bmwservice.repository.CarsRepository;

@Service
public class CarsService {
	
	@Autowired
	private CarsRepository carsRepository;
	
	
//	add a car
	public Cars addNewCar(Cars car) {
		if(!isExistsByModel(car.getModel())) {
			return carsRepository.save(car);
		}
		else  
			throw new RuntimeException("Car with model:: "+car.getModel()+" already exists");
	}
	
	
	public List<Cars> findByModelYear(String modelYear){
		return carsRepository.findByModelYear(modelYear);
	}
	
	private boolean isExistsByModel(String model) {
		return carsRepository.existsByModel(model) ? true : false ;
	}

}
