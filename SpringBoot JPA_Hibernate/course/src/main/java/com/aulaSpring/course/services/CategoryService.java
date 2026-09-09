package com.aulaSpring.course.services;

import com.aulaSpring.course.entities.Category;
import com.aulaSpring.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> categoryOpt = categoryRepository.findById(id);

        return categoryOpt.get();
    }
}
