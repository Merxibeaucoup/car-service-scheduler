package com.edgar.bmwservice.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "user_appmnt")
public class Appointment extends BaseEntity {
	
	@OneToMany
	private List<ServicesProvided> service;
	
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime appointmentDateTime;
	
	private String repairOrderNumber;
	
	private String advisor;
	
	private BigDecimal invoiceTotal;
	
	@OneToMany
	private List<Operations> operationsPerformed;
	

}
