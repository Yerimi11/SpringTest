package com.example.mock.repository;

import com.example.mock.model.MockEntity;
import org.springframework.stereotype.Repository;

@Repository
public class MockRepository {
    public MockEntity find(String query) {
        return new MockEntity(query, (int) (Math.random()*100));
    }
}
