package com.team2.router.clients;

import com.team2.router.dto.searchClient.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "searchClient",url = "http://localhost:8090/")
public interface SearchClient {

    @GetMapping("search-ms/product/search/{searchTerm}")
    List<ProductDTO> findByCustomQuery(@PathVariable("searchTerm") String searchTerm);

}
