package com.coderhouse.Clase8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coderhouse.Clase8.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
