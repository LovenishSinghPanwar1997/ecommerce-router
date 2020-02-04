package com.team2.router.dto.cartClient;
import lombok.*;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart {
    private String customerId;
    private String customerEmailId;
    private List<Product> productsBought;
    private Date dateOfPlacingOrder;
    private String address;
}
