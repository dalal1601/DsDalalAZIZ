package com.example.dsgraphql;

import com.example.dsgraphql.dto.ComputerDTO;
import com.example.dsgraphql.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DSgraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DSgraphqlApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerService computerService) {
        return args -> {
            computerService.saveComputers(
                    List.of(
                            ComputerDTO.builder().proce("azert").ram("aze").hardDrive("qsd").price(45.0).build(),
                            ComputerDTO.builder().proce("qsdfg").ram("ooo").hardDrive("www").price(50.0).build(),
                            ComputerDTO.builder().proce("sdfg").ram("mmmm").hardDrive("xxx").price(10.0).build(),
                            ComputerDTO.builder().proce("dfghj").ram("jjj").hardDrive("ccc").price(66.0).build()


                            )
            );


        };
    }



}
