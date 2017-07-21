package com.sopra.cloud.invoiceserviceclient.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sopra.cloud.invoiceserviceclient.InvoiceClient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InvoiceServiceClientTestApplication.class)
public class InvoiceClientRestImplTest {
	@Autowired
	private InvoiceClient invoiceClient;

	@Test
	public void testInvoiceClient() {
		int existingSize = invoiceClient.findAll().size();

		invoiceClient.newInvoice();

		Assert.assertEquals(existingSize + 1, invoiceClient.findAll().size());
	}
}
