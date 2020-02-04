package com.team2.router.service;

import com.team2.router.dto.customerClient.OrderHistoryDTO;

import java.util.List;

public interface CustomerPageService {

    List<OrderHistoryDTO> getOrderHistory(Integer span,String customerId);

}
