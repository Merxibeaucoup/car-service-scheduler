package com.edgar.bmwservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgar.bmwservice.models.Cars;

public interface CarsRepository extends JpaRepository<Cars, Long> {

	List<Cars> findByModel(String model);
	List<Cars> findByModelYear(String modelYear);
	List<Cars> findBySeries(String series);
	boolean existsByModel(String model);

}
