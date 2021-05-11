package com.example.springdocker.service;

import com.example.springdocker.model.Dog;
import com.example.springdocker.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class DogService {

    private final DogRepository dogRepository;

    public List<Dog> getAllDogs(){
        return dogRepository.findAll();
    }

    public void addDog(Dog dog){
        dogRepository.save(dog);
    }

    public List<String> getHouseTrainedDogs(){
        List<Dog> houseTrainedDogs = dogRepository.findByHouseTrained(true);

        return houseTrainedDogs.stream()
                .map(Dog::getName)
                .collect(Collectors.toList());
    }
}
