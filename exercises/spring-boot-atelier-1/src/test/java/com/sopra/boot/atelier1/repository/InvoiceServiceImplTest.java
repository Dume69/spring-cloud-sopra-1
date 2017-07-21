package com.sopra.boot.atelier1.repository;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

import com.sopra.boot.atelier1.Atelier1Application;
import com.sopra.boot.atelier1.model.Invoice;
import com.sopra.boot.atelier1.service.InvoiceService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Atelier1Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class InvoiceServiceImplTest {
	@Autowired
	private InvoiceService invoiceService;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testRepository() {
		invoiceService.save(new Invoice(0, new Date()));

		Assert.assertFalse(restTemplate
				.exchange("/invoice", HttpMethod.GET, null, new ParameterizedTypeReference<List<Invoice>>() {
				}).getBody().isEmpty());
	}
}
