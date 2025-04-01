package com.example.demo.controller;


import com.example.demo.model.FoodItem;
import com.example.demo.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class FoodItemController {
    
    @Autowired
    private FoodItemService service;
    
    @GetMapping("/")
    public String home(){
        return "redirect:/index";
    }
    

    @GetMapping("api/food/available")
    public List<FoodItem> getAvailableFoodItems() {
        return service.getAvailableItems();
    }
    
    @PostMapping("api/food/add")
    public FoodItem addFoodItem(@RequestBody FoodItem item) {
        return service.addFoodItem(item);
    }    

    @PostMapping("/api/food/reserve/{id}")
    public FoodItem reserveFoodItem(@PathVariable Long id) {
        return service.reserveItem(id);
    }
}
