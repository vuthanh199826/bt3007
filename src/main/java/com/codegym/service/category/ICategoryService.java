package com.codegym.service.category;

import com.codegym.model.Category;
import com.codegym.model.Product;

import java.util.Optional;

public interface ICategoryService {
    Optional<Category> findById(Long id);
    Iterable<Category> findAll();

}
