package com.example.springdocker.repository;

import com.example.springdocker.model.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class DogRepositoryTest {

    @Autowired
    DogRepository dogRepository;

    @Test
    void findByHouseTrainedTest() {
        Dog expected = new Dog("1", "Dogge", 3, "Labb", true);

        dogRepository.save(expected);

        List<Dog> actual = dogRepository.findByHouseTrained(true);

        assertEquals(actual.get(0), expected);

    }
}