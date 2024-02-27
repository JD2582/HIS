package com.example.his.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admit {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long admitId;

        @ManyToOne
        @JoinColumn(name = "patient_id")
        private Patient patient;

        //To check is OP or IP
        private String patientType;
        private boolean isActive;
        private boolean isEmergency;
        private Date date;
    }
