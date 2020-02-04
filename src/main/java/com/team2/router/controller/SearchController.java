package com.team2.router.controller;

import com.team2.router.base.BaseResponse;
import com.team2.router.dto.searchClient.ProductDTO;
import com.team2.router.service.SeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
@CrossOrigin(origins = {"*"})
public class SearchController {

    @Autowired
    SeachService seachService;

    @GetMapping("/{searchText}")
    BaseResponse<List<ProductDTO>> findByCustomQuery(@PathVariable("searchText") String searchTerm)
    {
        return new BaseResponse<>(seachService.findByCustomQuery(searchTerm));
    }


}
