package com.example.his.Dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class LoginDTO {

    private String username;
    private String password;
    private String role;
    private boolean isActive;
    private Date updatedAt;

}
