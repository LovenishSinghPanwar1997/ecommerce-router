package com.team2.router.controller;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.productClient.CategoryListResponse;
import com.team2.router.dto.productClient.GetCategoriesResponse;
import com.team2.router.dto.responseDTO.HomeCategoryResponseDTO;
import com.team2.router.dto.responseDTO.HomeResponseDTO;
import com.team2.router.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
@CrossOrigin(origins = {"*"})
public class HomePageController {

    @Autowired
    HomePageService homePageService;

    @GetMapping
    public BaseResponse<HomeResponseDTO> getHomeData()
    {
        try {
            return new BaseResponse<>(homePageService.getHomeData());
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>("ERROR MESSAGE");
        }
    }

    @GetMapping("/{categoryId}")
    public BaseResponse<CategoryListResponse> getCategoryList(@PathVariable("categoryId") String categoryId)
    {
        return new BaseResponse<>(homePageService.getCategoryData(categoryId).getCategoryData());
    }

}
