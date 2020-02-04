package com.team2.router.controller;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.responseDTO.ProdDescPageDTO;
import com.team2.router.service.ProdDescPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/description")
@CrossOrigin(origins = {"*"})
public class ProdDescPageController {


    @Autowired
    private ProdDescPageService prodDescPageService;


    @GetMapping("/{productId}")
    public BaseResponse<ProdDescPageDTO> getProductById(@PathVariable("productId") String productId)
    {
        return new BaseResponse<>(prodDescPageService.getProductById(productId));
    }



}
