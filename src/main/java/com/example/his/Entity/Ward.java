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
    private String wardId;

    private String wardNo;
    private String wardType;
    private Date inDate;
    private boolean isEmpty;
    private String patient;
}
