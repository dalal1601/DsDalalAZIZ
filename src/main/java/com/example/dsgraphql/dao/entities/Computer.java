package com.example.dsgraphql.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Computer {
    @Id
    @GeneratedValue
    private Long id_Pc;
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
    private String macAddress;


}
