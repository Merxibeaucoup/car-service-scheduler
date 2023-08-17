package com.edgar.bmwservice.models;

import jakarta.persistence.Column;
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
public class Operations extends BaseEntity {

	@Column(columnDefinition = "TEXT")
	private String workPerformed;
	
	@Column(columnDefinition = "TEXT")
	private String concern;
	
	@Column(columnDefinition = "TEXT")
	private String cause;
	
	@Column(columnDefinition = "TEXT")
	private String correction;
}
