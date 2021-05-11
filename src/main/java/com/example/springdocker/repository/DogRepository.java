package com.example.springdocker.repository;

import com.example.springdocker.model.Dog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends MongoRepository<Dog, String> {
    List<Dog>findByHouseTrained(boolean isHouseTrained);
}
