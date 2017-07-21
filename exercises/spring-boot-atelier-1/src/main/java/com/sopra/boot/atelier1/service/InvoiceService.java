package com.sopra.boot.atelier1.service;

import java.util.List;

import com.sopra.boot.atelier1.model.Invoice;

public interface InvoiceService {
	List<Invoice> findAll();
	
	Invoice save(Invoice invoice);
}
