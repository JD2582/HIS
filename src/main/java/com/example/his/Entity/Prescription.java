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
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long presId;

    @OneToOne
    @JoinColumn(name = "diagnosis_id")
    private Diagnosis diagnosis;

    @ManyToOne
    @JoinColumn(name="pharma_id")
    private Pharma pharma;


    private Date date;
}
