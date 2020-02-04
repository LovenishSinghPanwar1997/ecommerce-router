package com.team2.router.dto.customerClient;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderHistoryDTO {

    private String customerId;
    private String productId;
    private String productName;
    private String productImage;
    private Double productPrice;
    private Integer productQuantity;
    private String orderId;
    private String orderDate;
    private Long timeInMillis;

}
