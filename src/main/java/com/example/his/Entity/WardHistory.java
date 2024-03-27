package com.example.his.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class WardHistory {
    @Id
    private String wardId;

    private String wardNo;
    private String wardType;
    private Date inDate;
    private Date outDate;
}
