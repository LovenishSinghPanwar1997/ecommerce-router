package com.team2.router.dto.responseDTO;

import com.team2.router.dto.productClient.CategoryListResponse;
import com.team2.router.dto.productClient.GetCategoriesResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HomeResponseDTO {
    private Integer cartCount;
    private List<CategoryListResponse> categories;

}
