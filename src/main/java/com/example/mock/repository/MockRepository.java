package com.example.mock.repository;

import com.example.mock.model.MockEntity;
import org.springframework.stereotype.Repository;

@Repository
public class MockRepository {
    public MockEntity find(String query) {
        MockEntity entity = new MockEntity(query, 1);
        return entity;
    }
}
