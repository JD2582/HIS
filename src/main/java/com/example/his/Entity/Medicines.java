package com.example.his.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@IdClass(CompMedicineKey.class)
public class Medicines {

    @Id
    private String medicineName;
    @Id
    private String presId;

    private Integer medicineCnt;

    @ManyToOne
    @JoinColumn(name="presId")
    private Prescription prescription;
}
