package com.team2.router.dto.merchantClient;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDTO {

    private String productId;
    private String productName;
    private Double productPrice;
    private String productDescription;
    private String usp;
    private Integer stock;
    private Integer productSold;
    private MerchantDTO merchant;

}
