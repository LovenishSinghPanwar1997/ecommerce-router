package com.team2.router.service.impl;

import com.team2.router.base.BaseResponse;
import com.team2.router.clients.CartClient;
import com.team2.router.clients.CustomerClient;
import com.team2.router.dto.cartClient.Cart;
import com.team2.router.dto.cartClient.ProductDTO;
import com.team2.router.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartClient cartClient;

    @Autowired
    CustomerClient customerClient;

    @Override
    public BaseResponse<Cart> getCart(String customerEmailId) {
        return new BaseResponse<>(cartClient.updateCart(customerEmailId));
    }

    @Override
    public BaseResponse<Cart> addToCart(String customerEmailId, ProductDTO productDTO) {
        BaseResponse<Cart> baseResponse = new BaseResponse<>();
        Cart cart = cartClient.addToCart(customerEmailId,productDTO);
        if(null!=cart){
            baseResponse.setData(cart);
            baseResponse.setStatus(true);
        } else {
            baseResponse.setErrorMessage("Not Enough Quantity Found");
            baseResponse.setStatus(false);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse<Integer> getCartProductCount(String customerEmailId) {
        return new BaseResponse<>(cartClient.getCartProductCount(customerEmailId));
    }

    @Override
    public BaseResponse<String> createOrderOnBuyNow(String customerId) {
        BaseResponse<String> baseResponse = new BaseResponse<>();

        baseResponse.setData(cartClient.createOrderOnBuyNow(customerId));
        baseResponse.setStatus(true);
        return baseResponse;
    }



    @Override
    public BaseResponse<Cart> mergeCart(String customerEmailId, List<ProductDTO> productDTO) {
        BaseResponse<Cart> baseResponse = new BaseResponse<>();
        Cart cart = cartClient.mergeCartInCartMs(customerEmailId,productDTO);
        if(null!=cart){
            baseResponse.setData(cart);
            baseResponse.setStatus(true);
        } else {
            baseResponse.setErrorMessage("Not Enough Quantity Found");
            baseResponse.setStatus(false);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse<Boolean> buyNow(String customerEmaild) {
        return new BaseResponse<>(cartClient.buyNow(customerEmaild));
    }
}
