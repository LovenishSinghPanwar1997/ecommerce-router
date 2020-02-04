package com.team2.router.dto.searchClient;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {

    private String productId;
    private String productName;
    private String productImage;
    private Double productPrice;
    private String productDescription;
    private String usp;
    private String attributes;
    private String categories;
    private Integer quantity;
    private String merchantId;

}
