package com.team2.router.service;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.cartClient.Cart;
import com.team2.router.dto.cartClient.ProductDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CartService {

    BaseResponse<Cart> getCart(String customerEmailid);
    BaseResponse<Cart> addToCart(String customerEmailId,ProductDTO productDTO);
    BaseResponse<Integer> getCartProductCount(String customerEmailId);
    BaseResponse<String> createOrderOnBuyNow(String customerId);


    BaseResponse<Cart> mergeCart(String customerEmailId, List<ProductDTO> productDTO);

    BaseResponse<Boolean> buyNow(String customerEmaild);
}
