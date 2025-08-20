package com.example.food.service;

import com.example.food.DTO.CategoriesDTO;
import com.example.food.DTO.response.ApiResponse;

import java.util.List;

public interface CategoriesService {
    ApiResponse<CategoriesDTO> createCategory(CategoriesDTO categoryDTO);
    ApiResponse<CategoriesDTO> updateCategory(Long id, CategoriesDTO categoryDTO);
    ApiResponse<String> deleteCategory(Long id);
    ApiResponse<CategoriesDTO> getCategoryById(Long id);
    ApiResponse<List<CategoriesDTO>> getAllCategories();
    ApiResponse<List<CategoriesDTO>> getRootCategories();
    ApiResponse<List<CategoriesDTO>> getCategoryTree();
}
