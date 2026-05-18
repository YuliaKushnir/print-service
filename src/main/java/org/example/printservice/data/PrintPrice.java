package org.example.printservice.data;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "print_prices",
        indexes = {
                @Index(name = "idx_print_price_type", columnList = "print_type_id"),
                @Index(name = "idx_print_price_size", columnList = "size")
        })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrintPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "print_type_id", nullable = false)
    private PrintType printType;

    private String size;

    private BigDecimal price;
}
