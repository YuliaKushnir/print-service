package org.example.printservice.repository;

import org.example.printservice.data.PrintPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PrintPriceRepository extends JpaRepository<PrintPrice, Long> {

    List<PrintPrice> findByPrintTypeId(Long printTypeId);

    Optional<PrintPrice> findByPrintTypeIdAndSize(Long typeId, String size);
}
