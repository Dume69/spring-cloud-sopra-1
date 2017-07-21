package com.sopra.cloud.invoiceserviceclient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sopra.cloud.invoiceserviceclient.model.Invoice;

public class InvoiceClientJsonMock implements InvoiceClient {
	private List<Invoice> invoices = new ArrayList<>();

	@Override
	public void newInvoice() {
		invoices.add(new Invoice(Double.valueOf(Math.random() * 100000).intValue(), new Date()));
	}

	@Override
	public List<Invoice> findAll() {
		return invoices;
	}
}
