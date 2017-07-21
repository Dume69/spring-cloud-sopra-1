package com.sopra.boot.atelier1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sopra.boot.atelier1.model.Invoice;
import com.sopra.boot.atelier1.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	private InvoiceRepository invoiceRepository;

	public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}

	@Override
	public List<Invoice> findAll() {
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice save(Invoice invoice) {
		return invoiceRepository.save(invoice);
	}

}
