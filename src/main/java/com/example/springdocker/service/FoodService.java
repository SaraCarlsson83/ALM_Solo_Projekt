package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FoodService {
    private final FoodRepository repository;

    public List<Food> getFoods() {
        return repository.findAll();
    }

    public void saveNewFood(Food food) {
        repository.save(food);
    }

    public List<String> getCookableFoods() {
        // hämtar alla Foods som vi kan laga
        List<Food> cookableFoods = repository.findFoodByCanICookIt(true);

        // returnerar endast Food namnen i en lista
        return cookableFoods.stream()
                .map(Food::getName)
                .collect(Collectors.toList());
    }
}
