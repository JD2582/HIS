package com.example.his.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Getter
@Setter
public class DoctorDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private Date birthDate;
    private String phoneNumber;
    private String bloodGroup;
    private String specialization;
    private String department;
    private String experience;
    private String address;
    private Date updatedAt;
    private MultipartFile imageFile;
    private int mon;
    private int tue;
    private int wed;
    private int thu;
    private int fri;
    private int sat;

}