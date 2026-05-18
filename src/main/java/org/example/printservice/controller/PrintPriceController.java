package org.example.printservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.printservice.dto.PrintPriceDto;
import org.example.printservice.service.PrintPriceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/print-prices")
@RequiredArgsConstructor
public class PrintPriceController {

    private final PrintPriceService service;

    @GetMapping("/{typeId}")
    public List<PrintPriceDto> getByType(@PathVariable Long typeId) {
        return service.getByType(typeId);
    }

    @GetMapping("/price")
    public BigDecimal getPrice(@RequestParam Long typeId, @RequestParam String size) {
        return service.getPrice(typeId, size);
    }
}