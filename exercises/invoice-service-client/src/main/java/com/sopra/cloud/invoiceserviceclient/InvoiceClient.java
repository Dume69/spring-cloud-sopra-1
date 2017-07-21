package com.sopra.cloud.invoiceserviceclient;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sopra.cloud.invoiceserviceclient.model.Invoice;

@FeignClient(name = "invoice-service")
public interface InvoiceClient {
	@RequestMapping(path = "/invoice", method = RequestMethod.POST)
	void newInvoice();

	@RequestMapping(path = "/invoice", method = RequestMethod.GET)
	List<Invoice> findAll();
}