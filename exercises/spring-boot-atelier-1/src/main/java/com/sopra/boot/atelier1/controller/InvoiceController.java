package com.sopra.boot.atelier1.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.boot.atelier1.model.Invoice;
import com.sopra.boot.atelier1.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	private Logger LOGGER = LoggerFactory.getLogger(InvoiceController.class);

	private InvoiceService invoiceService;

	public InvoiceController(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}

	@PostMapping
	public Invoice newInvoice() {
		return invoiceService.save(new Invoice(0, new Date()));
	}

	@GetMapping
	public List<Invoice> findAll() throws InterruptedException {
		LOGGER.info("Loading invoices.");

		List<Invoice> invoices = invoiceService.findAll();

		LOGGER.info("Loaded invoices.");

		return invoices;
	}

}
