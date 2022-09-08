package com.example.mock.model;

import lombok.Getter;

public class MockEntity {

    private String name;
    private Integer age;

    public MockEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
