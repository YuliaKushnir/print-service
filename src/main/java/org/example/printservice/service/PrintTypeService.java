package org.example.printservice.service;

import org.example.printservice.dto.PrintTypeDto;

import java.util.List;

public interface PrintTypeService {
    List<PrintTypeDto> getAll();
}
