package com.team2.router.clients;

import com.team2.router.dto.cartClient.Cart;
import com.team2.router.dto.cartClient.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "cartclient",url = "http://localhost:8092")
public interface CartClient {


    @GetMapping("/cart-ms/get/{customerEmailId}")
    Cart updateCart(@PathVariable("customerEmailId") String customerEmailId);

    @PostMapping("/cart-ms/add/{customerId}")
    Cart addToCart(@PathVariable("customerId") String customerId, @RequestBody ProductDTO productDTO);

    @GetMapping("/cart-ms/getCartCount/{customerEmailId}")
    Integer getCartProductCount(@PathVariable("customerEmailId") String customerEmailId);

    @GetMapping("/cart-ms/createOrder/{customerId}")
    String createOrderOnBuyNow(@PathVariable("customerId") String customerId);

    @PostMapping("/cart-ms/merge/{customerEmailId}")
    Cart mergeCartInCartMs(@PathVariable("customerEmailId") String customerEmailId,@RequestBody List<ProductDTO> productDTO);

    @GetMapping("/cart-ms/buyNow/{customerEmaild}")
    Boolean buyNow(@PathVariable("customerEmaild") String customerEmaild);

}
