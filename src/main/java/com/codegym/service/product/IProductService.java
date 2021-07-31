package com.codegym.service.product;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);

    void save(Product product);

    void remove(Long id);

    Iterable<Product> findByCategory(String category);

    Page<Product> findAll(Pageable pageable);


}
