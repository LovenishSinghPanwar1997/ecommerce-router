package com.team2.router.dto.merchantClient;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchantToRouterDTO {

    private String merchantId;
    private  String merchantName;
    private String profileImage;
    private Integer noOfProductsSold;
    private String address;
    private String emailId;
    private String phoneNumber;
    private Double merchantRating;

    private List<ProductForMerchantTORouterDTO> productsOfMerchant;

}
