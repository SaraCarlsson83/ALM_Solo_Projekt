package com.example.springdocker.service;

import com.example.springdocker.model.Dog;
import com.example.springdocker.repository.DogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DogServiceTest {

    DogService dogService;

    @Mock
    DogRepository dogRepositoryMock;

    @BeforeEach
    void init(){
        dogService = new DogService(dogRepositoryMock);
    }

    @Test
    void getAllDogs() {
        Dog expected = new Dog("1", "Dogge", 3, "Labb", true);

        when(dogRepositoryMock.findAll())
                .thenReturn(Collections.singletonList(expected));

        List<Dog> actual = dogService.getAllDogs();

        assertEquals(actual.get(0), expected);
        assertEquals(actual.size(), 1);

        verify(dogRepositoryMock).findAll();
    }

    @Test
    void addDog() {
        Dog expected = new Dog("1", "Dogge", 3, "Labb", true);
        when(dogRepositoryMock.save(any()))
                .thenReturn(expected);

        Dog actual = dogService.addDog(expected);

        assertEquals(expected, actual);
        verify(dogRepositoryMock).save(any());
    }

    @Test
    void getHouseTrainedDogs() {
        Dog expected = new Dog("1", "Dogge", 3, "Labb", true);
        when(dogRepositoryMock.findByHouseTrained(anyBoolean()))
                .thenReturn(Collections.singletonList(expected));

        List<String> actual = dogService.getHouseTrainedDogs();

        assertEquals(actual.get(0), expected.getName());
        verify(dogRepositoryMock).findByHouseTrained(anyBoolean());
    }
}