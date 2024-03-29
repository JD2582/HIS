package com.example.his.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private Date birthDate;
    private String phoneNumber;
    private String bloodGroup;
    private String specialization;
    private String department;
    //store it as month
    private int experience;
    private String address;
    private String profileImage;

    // value of below seven field will be between 0-3
    private int mon;
    private int tue;
    private int wed;
    private int thu;
    private int fri;
    private int sat;

    @UpdateTimestamp
    private Date updatedAt;

}