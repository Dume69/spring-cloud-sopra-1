package com.sopra.cloud.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.cloud.invoiceserviceclient.InvoiceClient;
import com.sopra.cloud.invoiceserviceclient.model.Invoice;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	private Logger LOGGER = LoggerFactory.getLogger(InvoiceController.class);

	private InvoiceClient invoiceClient;

	public InvoiceController(InvoiceClient invoiceClient) {
		this.invoiceClient = invoiceClient;
	}

	@GetMapping
	public List<Invoice> findAll() {
		LOGGER.info("Loading invoices");

		List<Invoice> invoices = invoiceClient.findAll();

		LOGGER.info("Loaded invoices.");

		return invoices;
	}
}
