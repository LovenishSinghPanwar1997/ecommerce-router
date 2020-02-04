package com.team2.router.dto.cartClient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

     @Id
     private String id;
     private List<ProductDTO> productsBought;
     private Date dateOfPlacingOrder;
     private String customerId;
     private String address;




}
