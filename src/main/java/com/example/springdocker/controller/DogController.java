package com.example.springdocker.controller;

import com.example.springdocker.model.Dog;
import com.example.springdocker.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class DogController {

    private final DogService dogService;

    @GetMapping ("/dogs")
        public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @PostMapping("/addDog")
    public void addDog(@RequestBody Dog newDog){
        dogService.addDog(newDog);
    }

    @GetMapping("/houseTrained")
    public List<String> isHouseTrained(){
        return dogService.getHouseTrainedDogs();
    }
}
