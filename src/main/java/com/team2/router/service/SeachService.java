package com.team2.router.service;

import com.team2.router.dto.searchClient.ProductDTO;
import java.util.List;

public interface SeachService {

    List<ProductDTO> findByCustomQuery(String searchTerm);


}
