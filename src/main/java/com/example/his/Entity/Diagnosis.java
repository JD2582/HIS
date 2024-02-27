package com.example.his.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diagnosisId;

    @ManyToOne
    @JoinColumn(name = "admit_id")
    private Admit admit;

    private Date diagDate;
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private String img;
}
