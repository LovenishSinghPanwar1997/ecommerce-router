package com.team2.router.service.impl;

import com.team2.router.base.BaseResponse;
import com.team2.router.clients.ProductClient;
import com.team2.router.dto.productClient.CategoryListResponse;
import com.team2.router.dto.productClient.GetCategoriesResponse;
import com.team2.router.dto.responseDTO.HomeCategoryResponseDTO;
import com.team2.router.dto.responseDTO.HomeResponseDTO;
import com.team2.router.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomePageServiceImpl implements HomePageService {

    @Autowired
    ProductClient productClient;

    @Override
    public HomeResponseDTO getHomeData() {

       BaseResponse<GetCategoriesResponse> categoriesBase =  productClient.getCategories();
       List<CategoryListResponse> categories = categoriesBase.getData().getCategories();
       HomeResponseDTO homeResponseDTO = new HomeResponseDTO();
       homeResponseDTO.setCategories(categories);
       homeResponseDTO.setCartCount(0);         // set cart count from cart microservice when ready
        return homeResponseDTO;

    }

    @Override
    public HomeCategoryResponseDTO getCategoryData(String categoryId) {
        HomeResponseDTO homeResponseDTO = getHomeData();
        List<CategoryListResponse> categoriesListWithProduct = homeResponseDTO.getCategories();
        CategoryListResponse categorydata = new CategoryListResponse();
        for (CategoryListResponse c:categoriesListWithProduct)
        {
            if(c.getId().equals(categoryId))
            {
                categorydata = c;
                break;
            }
        }
        HomeCategoryResponseDTO homeCategoryResponseDTO = new HomeCategoryResponseDTO();
        homeCategoryResponseDTO.setCategoryData(categorydata);
        return homeCategoryResponseDTO;
    }
}
