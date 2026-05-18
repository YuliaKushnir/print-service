package org.example.printservice.repository;

import org.example.printservice.data.PrintType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrintTypeRepository extends JpaRepository<PrintType, Long> {
}
