package com.example.his.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shiftId;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "nurse_id")
    private Nurse nurse;

    private Integer slot;
    private Date shiftDate;

}
