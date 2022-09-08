package com.example.mock.model;

public class MockResult {

    private String name;
    private String age;

    public MockResult(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // Dto 역할을 하는 메서드
    public static MockResult convert(MockEntity entity) {
        String name = entity.getName();
        String age = entity.getAge().toString();
        return new MockResult(name, age);
    }
}
