package com.team2.router.dto.productClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCategoriesResponse {
    private List<CategoryListResponse> categories;
}
