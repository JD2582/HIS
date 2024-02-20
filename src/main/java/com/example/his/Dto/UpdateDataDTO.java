package com.example.his.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDataDTO {
    private String newUsername;
    private String newPassword;
    private String newRole;
}
