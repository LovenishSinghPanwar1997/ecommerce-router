package com.team2.router.clients;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.merchantClient.MerchantAddProdDTO;
import com.team2.router.dto.productClient.GetCategoriesResponse;
import com.team2.router.dto.productClient.Products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "productClient",url = "http://localhost:8087/")
public interface ProductClient {

    @GetMapping("product/categories")
    BaseResponse<GetCategoriesResponse> getCategories();

    @GetMapping("product/getAllProducts")
    BaseResponse<List<Products>> getAllProducts();

    @GetMapping("product/findById/{productId}")
    Products findByProductId(@PathVariable("productId") String productId);

    @PostMapping("product/add")
    public BaseResponse<Products> addProduct(@RequestBody MerchantAddProdDTO merchantAddProdDTO);


}
