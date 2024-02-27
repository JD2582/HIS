package com.example.his.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointId;

    @OneToOne
    @JoinColumn(name = "patientId")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="doctorId")
    private Doctor doctor;

    private Date appointmentdate;

}
