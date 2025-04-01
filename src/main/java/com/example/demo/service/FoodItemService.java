package com.example.demo.service;

import com.example.demo.model.FoodItem;
import com.example.demo.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodItemService {
    
    @Autowired
    private FoodItemRepository repository;
    
    public FoodItem addFoodItem(FoodItem item) {
        return repository.save(item);
    }

    public List<FoodItem> getAvailableItems() {
        return repository.findByReservedFalse();
    }

    public FoodItem reserveItem(Long id) {
        FoodItem item = repository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        item.setReserved(true);
        return repository.save(item);
    }
}