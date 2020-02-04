package com.team2.router.dto.cartClient;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

     List<ProductDTO> productsBought;
     Date Date;
     String CustomerId;
     String Address;
}
