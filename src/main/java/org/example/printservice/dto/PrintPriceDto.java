package org.example.printservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrintPriceDto {
    private Long id;
    private Long printTypeId;
    private String size;
    private BigDecimal price;
}