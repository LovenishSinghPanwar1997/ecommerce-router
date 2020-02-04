package com.team2.router.service.impl;

import com.team2.router.clients.CustomerClient;
import com.team2.router.dto.customerClient.OrderHistoryDTO;
import com.team2.router.service.CustomerPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerPageServiceImpl implements CustomerPageService {

    @Autowired
    CustomerClient customerClient;


    @Override
    public List<OrderHistoryDTO> getOrderHistory(Integer span, String customerEmailId) {
        String customerId = customerClient.getCustomerIdByEmailId(customerEmailId);
        return customerClient.getOrderHistory(span,customerId);
    }
}
