package com.example.his.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Entity
@Data
public class Admin {

    @Id
    private String adminId;

    private String firstName;
    private String lastName;
    private String phone;
    private String gender;
    private String email;
}
