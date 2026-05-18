package org.example.printservice.service;

import lombok.RequiredArgsConstructor;
import org.example.printservice.data.PrintPrice;
import org.example.printservice.dto.PrintPriceDto;
import org.example.printservice.repository.PrintPriceRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PrintPriceServiceImpl implements PrintPriceService {

    private final PrintPriceRepository repository;

    @Override
    @Cacheable(value = "printPrice", key = "#typeId + '_' + #size")
    public BigDecimal getPrice(Long typeId, String size) {

        return repository.findByPrintTypeIdAndSize(typeId, size)
                .map(PrintPrice::getPrice)
                .orElse(BigDecimal.ZERO);
    }

    @Override
    @Cacheable(value = "printPricesByType", key = "#typeId")
    public List<PrintPriceDto> getByType(Long typeId) {

        return repository.findByPrintTypeId(typeId)
                .stream()
                .map(p -> new PrintPriceDto(
                        p.getId(),
                        p.getPrintType().getId(),
                        p.getSize(),
                        p.getPrice()
                ))
                .toList();
    }
}