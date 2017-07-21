package com.sopra.boot.atelier1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.boot.atelier1.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
