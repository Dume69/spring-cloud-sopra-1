package com.sopra.cloud.erp.reception.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("inventory-service")
public interface InventoryClient {


    @RequestMapping(method = RequestMethod.POST, path = "/inventory/{productId}?increment")
    void incrementInventory(@PathVariable("productId") long productId);

}
