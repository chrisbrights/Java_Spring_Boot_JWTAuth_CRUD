package com.mysite.springbootcrud.service;

import com.mysite.springbootcrud.dto.category.CategoryDto;
import com.mysite.springbootcrud.entity.Category;
import com.mysite.springbootcrud.exceptions.ResourceNotFoundException;
import com.mysite.springbootcrud.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;


    public ResponseEntity<?> create(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        Category savedCategory = categoryRepository.save(category);
        return ResponseEntity.ok(savedCategory);
    }

    public ResponseEntity<?> update(Long categoryId, CategoryDto categoryDto) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(ResourceNotFoundException::new);
        category.setName(categoryDto.getName());
        Category updatedCategory = categoryRepository.save(category);
        return ResponseEntity.ok(updatedCategory);
    }

    public ResponseEntity<?> delete(Long categoryId) {
        categoryRepository.deleteById(categoryId);
        return ResponseEntity.ok("Success");
    }

    public ResponseEntity<?> get(Long categoryId) {
        return ResponseEntity.ok(categoryRepository.findById(categoryId).orElseThrow(ResourceNotFoundException::new));
    }


    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }
}
