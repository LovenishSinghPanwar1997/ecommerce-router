package com.team2.router.dto.cartClient;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    String name;
    Double price;
    String image;
    int quantity;
    String merchantId;
    String productId;
    String merchantName;



}
