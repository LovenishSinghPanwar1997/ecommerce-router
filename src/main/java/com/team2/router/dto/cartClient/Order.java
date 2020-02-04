package com.team2.router.dto.cartClient;
import lombok.*;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {


    private String id;
    private List<Product> productsBought;
    private String dateOfPlacingOrder;
    private String customerId;
    private String Address;
}