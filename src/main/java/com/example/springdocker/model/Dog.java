package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    String id;
    String Name;
    int age;
    String breed;
    boolean houseTrained;
}
