package com.edgar.bmwservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="bmw_cars")
public class Cars extends BaseEntity {
	
	
	@NotNull
	private String modelYear;
	
	@NotNull
	private String series;
	
	@NotNull
	private String model;
	

}
