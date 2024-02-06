package com.alejandro.springboot.di.app.springbootdi.repositories;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.alejandro.springboot.di.app.springbootdi.models.Product;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ProductRepositoryJson implements ProductRepository {

    List<Product> list;


public ProductRepositoryJson(Resource resource){
   // Resource reosurce = new ClassPathResource("product.json");
ObjectMapper objectMapper = new ObjectMapper();
try {
    list= Arrays.asList(objectMapper.readValue(resource.getInputStream(), Product[].class));

} catch (IOException e) {

    e.printStackTrace();
}

}


    @Override
    public List<Product> findAll() {
    
        return list;
    }

    @Override
    public Product findById(Long id) {
        
        return list.stream().filter(p ->  p.getId().equals(id)).findFirst().orElseThrow() ;
    }

}
