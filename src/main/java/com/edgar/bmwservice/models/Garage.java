package com.edgar.bmwservice.models;

import java.util.List;
import java.util.Set;

import com.edgar.bmwservice.security.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Garage extends BaseEntity {



	@NotNull
	private String modelYear;

	@NotNull
	private String series;

	@NotNull
	private String model;

	@NotNull
	private String vinNumber;

	private String lastReportedMileage;

	@OneToMany
	private List<Appointment> repairHistory;
	
	@OneToMany
	private Set<ServicesProvided> recommendedServices;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}
