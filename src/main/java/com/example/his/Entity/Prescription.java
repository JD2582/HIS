package com.example.his.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Clob;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {
    @Id
    private String presId;

    private String patientId;

    @Lob
    private String medicines;

    private String diagnosisId;
    private String pharmacistId;
    private String doctorId;
    private Date presDate;
}
