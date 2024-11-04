package ru.maxima.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animal {
    private String type;
    private String name;
    private int age;
}
