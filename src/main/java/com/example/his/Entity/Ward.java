package com.example.his.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ward {

    @Id
    private String wardNum;

    private String wardType;
    private Date inDate;
    private Date outDate;

    @OneToMany
    @JoinColumn(name = "patientId")
    private List<Patient> patient;




}
