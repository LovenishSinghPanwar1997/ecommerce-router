package com.team2.router.dto.productClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryListResponse {
    private String id;
    private String image;
    private String name;
    private List<ProductListResponse> products;
}
