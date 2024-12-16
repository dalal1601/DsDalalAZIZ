package com.example.dsgraphql.service;

import com.example.dsgraphql.dao.entities.Computer;
import com.example.dsgraphql.dao.repositories.ComputerRepository;
import com.example.dsgraphql.dto.ComputerDTO;
import com.example.dsgraphql.mapper.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer>computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers){
            computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
        }
        return computerDTOS;
    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.fromComputerDTOtoComputer(computerDTO);
        computerRepository.save(computer);
        computerDTO = computerMapper.fromComputertoComputerDTO(computer);
        return  computerDTO;
    }

    @Override
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS) {
        List<Computer>computers= new ArrayList<>();
        for (ComputerDTO computerDTO  : computerDTOS ){
            computers.add(computerMapper.fromComputerDTOtoComputer(computerDTO));
        }
        computerRepository.saveAll(computers);
        computerDTOS = new ArrayList<>();
        for (Computer computer: computers){
            computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
        }

        return computerDTOS;
    }
}
