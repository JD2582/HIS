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
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String phoneNumber;
    private String bloodGroup;
    private String specialization;
    private String experience;
    private String address;
    private Date updatedAt;
//    @Lob
//    private byte[] image;
    private String profileImage;
//    @PrePersist
//    protected void onCreate() {
//        updatedAt = new Date();
//    }
}