package com.edgar.bmwservice.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
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
@Table(name="bmw_services")
public class ServicesProvided extends BaseEntity {

	@NotNull
	private String serviceName;

	@NotNull
	private BigDecimal servicePrice;
	
	@NotNull
	private String serviceImage;

	@Column(columnDefinition = "TEXT")
	private String description;

	@NotNull
	private List<String> workedPerformedInService = new ArrayList<>();

	@NotNull
	private String subDesc;

}
