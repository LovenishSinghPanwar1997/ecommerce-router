package com.team2.router.clients;

import com.team2.router.dto.customerClient.OrderHistoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "customerclient",url = "http://localhost:8091")
public interface CustomerClient {

    @GetMapping("/order/history/{customerId}/{span}")
    List<OrderHistoryDTO> getOrderHistory(@PathVariable("span") Integer span,@PathVariable("customerId") String customerId);


    @GetMapping("customer-ms/getIdByEmail/{customerEmailId}")
    String getCustomerIdByEmailId(@PathVariable("customerEmailId") String customerEmailId);

}
