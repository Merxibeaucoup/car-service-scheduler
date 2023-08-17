package com.edgar.bmwservice.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
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
public class ServicesProvided extends BaseEntity {
	
	private String serviceName;
	
	private BigDecimal servicePrice;

}
