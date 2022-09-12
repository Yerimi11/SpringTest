package com.example.mock.model;

import lombok.Getter;

public class MockEntity {

    private String name;
    private Integer randomNums;

    public MockEntity(String name, Integer randomNums) {
        this.name = name;
        this.randomNums = randomNums;
    }

    public String getName() {
        return name;
    }

    public Integer getRandomNums() {
        return randomNums;
    }
}
