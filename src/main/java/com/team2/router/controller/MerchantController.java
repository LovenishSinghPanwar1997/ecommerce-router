package com.team2.router.controller;

import com.team2.router.base.BaseResponse;
import com.team2.router.clients.MerchantClient;
import com.team2.router.clients.ProductClient;
import com.team2.router.dto.merchantClient.MerchantAddProdDTO;
import com.team2.router.dto.merchantClient.MerchantToRouterDTO;
import com.team2.router.dto.productClient.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/merchant")
@CrossOrigin(origins = {"*"})
public class MerchantController {

    @Autowired
    private MerchantClient merchantClient;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getInfo/{merchantId}")
    public BaseResponse<MerchantToRouterDTO> getMerchantInfo(@PathVariable("merchantId") String merchantId)
    {
        return merchantClient.getMerchantInfo(merchantId);
    }

    @PostMapping("/addProduct")
    public BaseResponse<Products> addProduct(@RequestBody MerchantAddProdDTO merchantAddProdDTO)
    {
        return productClient.addProduct(merchantAddProdDTO);
    }

    @GetMapping("/setProductRating/{rating}/{productId}")
    public BaseResponse<Integer> setProductRating(@PathVariable("rating") int rating,@PathVariable("productId") String productId)
    {
        return new BaseResponse<>(merchantClient.setProductRating(rating,productId));
    }

    @GetMapping("/getProductRating/{productId}")
    public BaseResponse<Integer> getProductRating(@PathVariable("productId") String productId)
    {
        return new BaseResponse<>(merchantClient.getProductRating(productId));
    }

}
