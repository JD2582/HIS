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
    private String diagnosisId;
    private String admitId;
    private String doctorId;
    private Date diagnosisDate;
    private String remarks;
    private String imgPath;
}
