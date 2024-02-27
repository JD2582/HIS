package com.example.his.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CompMedicineKey implements Serializable {

    private String medicineName;
    private String presId;
}
