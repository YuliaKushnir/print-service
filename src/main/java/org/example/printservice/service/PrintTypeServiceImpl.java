package org.example.printservice.service;

import lombok.RequiredArgsConstructor;
import org.example.printservice.dto.PrintTypeDto;
import org.example.printservice.repository.PrintTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrintTypeServiceImpl implements PrintTypeService {

    private final PrintTypeRepository repository;

    @Override
    public List<PrintTypeDto> getAll() {
        return repository.findAll()
                .stream()
                .map(t -> new PrintTypeDto(t.getId(), t.getName()))
                .toList();
    }
}