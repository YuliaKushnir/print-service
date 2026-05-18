package org.example.printservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.printservice.dto.PrintTypeDto;
import org.example.printservice.service.PrintTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/print-types")
@RequiredArgsConstructor
public class PrintTypeController {

    private final PrintTypeService service;

    @GetMapping
    public List<PrintTypeDto> getAll() {
        return service.getAll();
    }
}