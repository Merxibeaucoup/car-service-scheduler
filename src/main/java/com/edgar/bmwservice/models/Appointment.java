package com.edgar.bmwservice.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.edgar.bmwservice.enums.AppointmentStatus;
import com.edgar.bmwservice.security.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

	@ManyToOne
	private ServicesProvided service;

	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime appointmentDateTime;

	private String repairOrderNumber;

	private String advisor;

	private BigDecimal invoiceTotal;

	@ManyToOne
	private Slot slot;

	@Enumerated(EnumType.STRING)
	private AppointmentStatus appointmentStatus;

	@OneToMany
	private List<Operations> operationsPerformed;

	@OneToOne
	private User client;

}
