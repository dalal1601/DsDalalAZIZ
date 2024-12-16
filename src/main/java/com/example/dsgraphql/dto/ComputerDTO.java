package com.example.dsgraphql.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ComputerDTO {
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
}
