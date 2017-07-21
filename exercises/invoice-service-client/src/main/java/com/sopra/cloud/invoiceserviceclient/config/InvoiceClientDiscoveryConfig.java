package com.sopra.cloud.invoiceserviceclient.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import com.sopra.cloud.invoiceserviceclient.InvoiceClient;

@Configuration
@EnableDiscoveryClient
//@EnableFeignClients(clients = InvoiceClient.class)
@ConditionalOnProperty(name = "invoice.service.mock", havingValue = "false", matchIfMissing = true)
public class InvoiceClientDiscoveryConfig {

}
