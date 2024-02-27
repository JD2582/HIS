package com.example.his.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String phoneNumber;
    private String bloodGroup;
    private String specialization;
    //store it as number of month
    private int pastExperience;
    private String address;
    private String profileImage;
    private boolean isHead;


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
