package com.team2.router.dto.cartClient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String productId;
    private String name;
    private Double price;
    private String image;
    private int quantity;
    private String merchantId;
    private String merchantName;

}
