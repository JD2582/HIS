package com.example.his.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@Table
@Entity
public class Login {
    @Id
    private String username;
    private String password;
    private String role;
    private boolean isActive;
    private String userId;



    @UpdateTimestamp
    private java.sql.Date updatedAt;


}
