package com.team2.router.service;

import com.team2.router.dto.responseDTO.HomeCategoryResponseDTO;
import com.team2.router.dto.responseDTO.HomeResponseDTO;

public interface HomePageService {

    HomeResponseDTO getHomeData() throws Exception;

    HomeCategoryResponseDTO getCategoryData(String categoryId);

}
