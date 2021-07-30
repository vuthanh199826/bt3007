package com.codegym.formatter;

import com.codegym.model.Category;
import com.codegym.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
@Component
public class CategoryFormatter implements Formatter<Category> {
    ICategoryService categoryService;

    @Autowired
    public CategoryFormatter(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        return this.categoryService.findById(Long.parseLong(text)).get();
    }

    @Override
    public String print(Category object, Locale locale) {
        return null;
    }
}
