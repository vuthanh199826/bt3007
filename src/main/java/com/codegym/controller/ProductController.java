package com.codegym.controller;


import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.service.category.ICategoryService;
import com.codegym.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/home")
    public ModelAndView getAllPage() {
        ModelAndView modelAndView = new ModelAndView("/product/home");
        return modelAndView;
    }


//    @PostMapping
//    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
//        productService.save(product);
//        return new ResponseEntity<>( HttpStatus.CREATED);
//    }


    @GetMapping
    public ResponseEntity<Iterable<Product>> allProduct() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<Iterable<Category>> showFormCreate() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

//    @DeleteMapping
//    public ResponseEntity<Product> deleteProduct(@RequestBody Long id) {
//        productService.remove(id);
//        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
//    }

//    @PutMapping
//    public ResponseEntity<Product> products(@RequestBody Long id) {
//        Product product = productService.findById(id).get();
//        return new ResponseEntity<>(product, HttpStatus.OK);
//    }

//    @PostMapping("/update")
//    public ResponseEntity<Product> update(@RequestBody Product product){
//        productService.save(product);
//        return new ResponseEntity<>(HttpStatus.ACCEPTED);
//    }


}