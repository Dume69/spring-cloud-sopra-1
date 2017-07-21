package com.sopra.cloud.invoiceserviceclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sopra.cloud.invoiceserviceclient.model.Invoice;

public class InvoiceClientRestImpl implements InvoiceClient {
	private RestTemplate restTemplate;

	public InvoiceClientRestImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public void newInvoice() {
		restTemplate.exchange("http://invoice-service/invoice", HttpMethod.POST, null, Invoice.class);
	}

	@Override
//	@HystrixCommand(fallbackMethod = "findAllFallback")
	public List<Invoice> findAll() {
		return restTemplate.exchange("http://invoice-service/invoice", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Invoice>>() {
				}).getBody();
	}

	public List<Invoice> findAllFallback() {
		return Arrays.asList();
	}
}
