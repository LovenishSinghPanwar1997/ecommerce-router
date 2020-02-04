package com.team2.router.controller;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.cartClient.Cart;
import com.team2.router.dto.cartClient.ProductDTO;
import com.team2.router.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = {"*"})
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/get/{customerEmailId}")
    BaseResponse<Cart> getCart(@PathVariable("customerEmailId") String customerEmailid)
    {
        return cartService.getCart(customerEmailid);
    }

    @PostMapping("/add/{customerId}")
    BaseResponse<Cart> addToCart(@PathVariable("customerId") String customerEmailId, @RequestBody ProductDTO productDTO){
        return cartService.addToCart(customerEmailId,productDTO);
    }

    @GetMapping("/getCartCount/{customerEmailId}")
    BaseResponse<Integer> getCartProductCount(@PathVariable("customerEmailId") String customerEmailId){
        return cartService.getCartProductCount(customerEmailId);
    }

    @GetMapping("/createOrder/{customerId}")
    BaseResponse<String> createOrderOnBuyNow(@PathVariable("customerId") String customerId){

        return cartService.createOrderOnBuyNow(customerId);

    }

    @PostMapping("/mergeCart/{customerEmailId}")
    BaseResponse<Cart> mergeCart(@PathVariable("customerEmailId") String customerEmailId, @RequestBody List<ProductDTO> productDTO)
    {
        return cartService.mergeCart(customerEmailId,productDTO);
    }

    @GetMapping("/buyNow/{customerEmaild}")
    public BaseResponse<Boolean> buyNow(@PathVariable("customerEmaild") String customerEmaild)
    {
        return cartService.buyNow(customerEmaild);
    }

}
