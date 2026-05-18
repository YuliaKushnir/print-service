package org.example.printservice.service;

import org.example.printservice.dto.PrintPriceDto;

import java.math.BigDecimal;
import java.util.List;

public interface PrintPriceService {
    List<PrintPriceDto> getByType(Long typeId);
    BigDecimal getPrice(Long typeId, String size);
}