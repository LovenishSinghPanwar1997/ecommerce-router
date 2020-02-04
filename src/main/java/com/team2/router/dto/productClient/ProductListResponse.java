package com.team2.router.dto.productClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductListResponse {
    private String id;
    private String name;
    private Double price;
    private String image;
}
