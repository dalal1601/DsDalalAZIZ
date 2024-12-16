package com.example.dsgraphql.mapper;

import com.example.dsgraphql.dao.entities.Computer;
import com.example.dsgraphql.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Computer fromComputerDTOtoComputer(ComputerDTO computerDTO){
        return mapper.map(computerDTO, Computer.class);
    }

    public ComputerDTO fromComputertoComputerDTO(Computer computer){
        return mapper.map(computer, ComputerDTO.class);
    }


}
