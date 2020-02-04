package com.team2.router.clients;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.merchantClient.MerchantAddProdDTO;
import com.team2.router.dto.merchantClient.MerchantToRouterDTO;
import com.team2.router.dto.merchantClient.ProductDTO;
import com.team2.router.dto.productClient.Products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "merchantClient",url = "http://localhost:8081")
public interface MerchantClient {

    @GetMapping("/merchant-product/getProductById/{productId}")
    ProductDTO getProductByIdFromMerchantMS(@PathVariable("productId") String productId);

    @GetMapping("/merchant/getInfo/{merchantId}")
    BaseResponse<MerchantToRouterDTO> getMerchantInfo(@PathVariable("merchantId") String merchantId);

    @PostMapping("/product/add")
    BaseResponse<Products> addProduct(@RequestBody MerchantAddProdDTO merchantAddProdDTO);

    @GetMapping("/merchant-product/setRating/{rating}/{productId}")
    Integer setProductRating(@PathVariable("rating") int rating,@PathVariable("productId") String productId);

    @GetMapping("/merchant-product/getRating/{productId}")
    Integer getProductRating(@PathVariable("productId") String productId);
}
