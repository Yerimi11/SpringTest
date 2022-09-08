package com.example.mock.service;

import com.example.mock.model.MockEntity;
import com.example.mock.model.MockParams;
import com.example.mock.model.MockResult;
import com.example.mock.repository.MockRepository;
import org.springframework.stereotype.Service;

@Service
public class MockService {
    private final MockRepository mockRepository;

    public MockService(MockRepository mockRepository) {
        this.mockRepository = mockRepository;
    }

    // Dto 역할
    public MockResult search(MockParams params) {
        String query = params.getQuery();
        MockEntity entity = mockRepository.find(query);
//        String name = entity.getName();
//        String age = entity.getAge().toString();
//        MockResult result = new MockResult(name, age);
        MockResult result = MockResult.convert(entity);
        return result;
    }
}
