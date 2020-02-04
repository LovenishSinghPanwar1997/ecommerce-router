package com.team2.router.service.impl;

import com.team2.router.clients.SearchClient;
import com.team2.router.dto.searchClient.ProductDTO;
import com.team2.router.service.SeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeachServiceImpl implements SeachService {

    @Autowired
    SearchClient searchClient;

    @Override
    public List<ProductDTO> findByCustomQuery(String searchTerm) {
       return searchClient.findByCustomQuery(searchTerm);
    }
}
