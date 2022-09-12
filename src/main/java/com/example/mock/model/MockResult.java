package com.example.mock.model;

import lombok.Getter;

@Getter
public class MockResult {

    private String name;
    private String randomNums;

    public MockResult(String name, String randomNums) {
        this.name = name;
        this.randomNums = randomNums;
    }

    // Dto 역할을 하는 메서드
    public static MockResult convert(MockEntity entity) {
        String name = entity.getName();
        String randomNums = entity.getRandomNums().toString();
        return new MockResult(name, randomNums);
    }
}
