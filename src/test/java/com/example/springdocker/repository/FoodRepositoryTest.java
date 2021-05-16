package com.example.springdocker.repository;

import com.example.springdocker.model.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class FoodRepositoryTest {

    @Autowired
    FoodRepository foodRepository;

    @Test
    void findFoodByCanICookItTest() {
        Food testFood = new Food();
        testFood.setName("Pasta");
        testFood.setDelicious(true);
        testFood.setCanICookIt(true);

        foodRepository.save(testFood);
        // ---------------------------

        List<Food> actual = foodRepository.findFoodByCanICookIt(true);

        // ---------------------------

        assertEquals(actual.get(0), testFood);
    }
}