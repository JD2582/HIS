package com.example.his.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Appointment {
    @Id
    private String appointId;

    private String doctorId;
    private String patientId;
    private String admitID;

    private Date appointmentdate;

}
