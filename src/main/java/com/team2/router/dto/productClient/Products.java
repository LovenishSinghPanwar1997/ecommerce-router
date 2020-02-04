package com.team2.router.dto.productClient;


import lombok.*;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Products {

    private String productId;
    private String productName;
    private List<String> images;
    private Map<String,String> attributes;

    private Category category;


    private SubCategory subCategory;

}
