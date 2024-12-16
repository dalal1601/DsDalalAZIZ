package com.example.dsgraphql.service;

import com.example.dsgraphql.dto.ComputerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComputerService {
    public List<ComputerDTO> getComputerByProce(String proce);
    public ComputerDTO saveComputer(ComputerDTO computerDTO);
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS);



    }
