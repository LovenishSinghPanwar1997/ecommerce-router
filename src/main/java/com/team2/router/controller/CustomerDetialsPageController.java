package com.team2.router.controller;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.customerClient.OrderHistoryDTO;
import com.team2.router.service.CustomerPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = {"*"})
public class CustomerDetialsPageController {

    @Autowired
    CustomerPageService customerPageService;

    @GetMapping("/customer/order-history/{span}/{customerEmailId}")
    public BaseResponse<List<OrderHistoryDTO>> getOrderHistory(@PathVariable("span") Integer span,@PathVariable String customerEmailId)
    {
        return new BaseResponse<>(customerPageService.getOrderHistory(span,customerEmailId));
    }

}
