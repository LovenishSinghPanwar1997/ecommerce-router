package com.team2.router.dto.merchantClient;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MerchantDTO {

    private String merchantId;
    private  String merchantName;
    private String profileImage;
    private Integer noOfProductsSold;
    private String address;
    private String emailId;
    private String phoneNumber;
    private Double merchantRating;



}
