package com.team2.router.dto.productClient;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SubCategory {

    private String subCategoryId;
    private String subCategoryName;
    private Category category;


}
