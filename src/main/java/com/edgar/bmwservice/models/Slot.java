package com.edgar.bmwservice.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "slots")
public class Slot extends BaseEntity {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDate date;
    private boolean isAvailable;

}