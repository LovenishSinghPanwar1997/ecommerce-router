package com.team2.router.dto.responseDTO;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProdDescPageDTO {


    private String productId;
    private String image;
    private String usp;
    private Double price;
    private String name;
    private Double merchantRating;
    private String description;
    private Map<String,String> attributes;
    private boolean stock;
    private String merchantName;
    private String merchantId;
    private String avgRating;

}
