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
        private String admitId;


        //To check is OP or IP
        private String patientType;
        private boolean isActive;
        private boolean isEmergency;
        private Date admitDate;
        private String patientID;
    }
