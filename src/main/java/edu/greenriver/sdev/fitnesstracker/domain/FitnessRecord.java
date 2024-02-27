package edu.greenriver.sdev.fitnesstracker.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FitnessRecord {
    private Long id;
    private String activity;
    private int duration; // in minutes
    private LocalDate date;

}