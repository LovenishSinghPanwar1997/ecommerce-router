package com.team2.router.service.impl;

import com.team2.router.clients.MerchantClient;
import com.team2.router.clients.ProductClient;
import com.team2.router.dto.merchantClient.ProductDTO;
import com.team2.router.dto.productClient.Products;
import com.team2.router.dto.responseDTO.ProdDescPageDTO;
import com.team2.router.service.ProdDescPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdDescPageServiceImpl implements ProdDescPageService {

    @Autowired
    ProductClient productClient;

    @Autowired
    MerchantClient merchantClient;

    public Products getProductDataFromProdMS(String productId) {
        return productClient.findByProductId(productId);
    }

    public ProductDTO getProductDataFromMerchantMs(String productId)
    {
        return merchantClient.getProductByIdFromMerchantMS(productId);
    }


    @Override
    public ProdDescPageDTO getProductById(String productId) {

        ProdDescPageDTO prodDescPageDTO = new ProdDescPageDTO();

        ProductDTO merchantProduct = getProductDataFromMerchantMs(productId);
        Products prodMsProduct = getProductDataFromProdMS(productId);

        prodDescPageDTO.setAttributes(prodMsProduct.getAttributes());
        prodDescPageDTO.setAvgRating("0"); // set avg rating from avg rating micro service
        prodDescPageDTO.setDescription(merchantProduct.getProductDescription());
        prodDescPageDTO.setImage(prodMsProduct.getImages().get(0));

        if(null==merchantProduct.getMerchant().getMerchantName())
            prodDescPageDTO.setMerchantName(null);
        else
            prodDescPageDTO.setMerchantName(merchantProduct.getMerchant().getMerchantName());

        prodDescPageDTO.setMerchantRating(0.0); // set rating when from rating micro service
        prodDescPageDTO.setName(prodMsProduct.getProductName());
        prodDescPageDTO.setPrice(merchantProduct.getProductPrice());

        if(merchantProduct.getStock()>0)
            prodDescPageDTO.setStock(true);
        else
            prodDescPageDTO.setStock(false);

        prodDescPageDTO.setUsp(merchantProduct.getUsp());
        prodDescPageDTO.setMerchantId(merchantProduct.getMerchant().getMerchantId());
        prodDescPageDTO.setProductId(productId);
        return prodDescPageDTO;
    }
}
