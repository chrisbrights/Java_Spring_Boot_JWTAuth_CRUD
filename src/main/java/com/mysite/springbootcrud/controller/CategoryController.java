package com.mysite.springbootcrud.controller;

import com.mysite.springbootcrud.dto.category.CategoryDto;
import com.mysite.springbootcrud.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/category")
public class CategoryController {


    private final CategoryService categoryService;


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CategoryDto categoryDto) {
        return categoryService.create(categoryDto);
    }

    @PutMapping("/update/{categoryId}")
    public ResponseEntity<?> update(@RequestBody CategoryDto categoryDto, @PathVariable Long categoryId) {
        return categoryService.update(categoryId, categoryDto);
    }

    @DeleteMapping("/delete/{categoryId}")
    public ResponseEntity<?> delete(@PathVariable Long categoryId) {
        return categoryService.delete(categoryId);
    }

    @PostMapping("/get/{categoryId}")
    public ResponseEntity<?> get(@PathVariable Long categoryId) {
        return categoryService.get(categoryId);
    }

    @PostMapping("/get-all")
    public ResponseEntity<?> create() {
        return categoryService.getAll();
    }
}
