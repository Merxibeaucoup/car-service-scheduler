package com.edgar.bmwservice.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.bmwservice.models.Cars;
import com.edgar.bmwservice.services.CarsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/cars")
@RequiredArgsConstructor
public class CarsController {

	private final CarsService carsService;

	// add new car controller
	@PostMapping("/addNew")
	public ResponseEntity<Cars> addNewCar(@RequestBody Cars car) {
		return ResponseEntity.ok(carsService.addNewCar(car));
	}

	//find list by model year
	@GetMapping("/byModelYear/{modelYear}")
	public ResponseEntity<List<Cars>> findByModelYear(@PathVariable String modelYear) {
		return ResponseEntity.ok(carsService.findByModelYear(modelYear));
	}

}
