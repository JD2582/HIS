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
public class Receptionist {
    @Id
    private String id;

    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String phoneNumber;
    private String bloodGroup;
    private String address;
    private String profileImage;
}
