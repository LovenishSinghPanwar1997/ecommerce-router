package com.team2.router.service;

import com.team2.router.dto.productClient.Products;
import com.team2.router.dto.responseDTO.ProdDescPageDTO;

public interface ProdDescPageService {

    ProdDescPageDTO getProductById(String productId);


}
