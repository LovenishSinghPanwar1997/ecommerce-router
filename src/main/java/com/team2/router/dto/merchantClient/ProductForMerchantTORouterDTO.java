package com.team2.router.dto.merchantClient;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class ProductForMerchantTORouterDTO {


    private String productId;
    private String productName;
    private Double productPrice;
    private String productDescription;
    private String usp;
    private Integer stock;
    private Integer productSold;
    private String productImage;

}
