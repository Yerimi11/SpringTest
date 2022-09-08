package com.example.mock.controller;

//import com.example.mock.wishlist.dto.WishListDto;

import com.example.mock.model.MockParams;
import com.example.mock.model.MockResult;
import com.example.mock.service.MockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // 로거 추가
@RestController
@RequestMapping("/api/mock")
public class MockController {

    private final MockService mockService;

    public MockController(MockService mockService) {
        this.mockService = mockService;
    }

    @GetMapping("/")
    public MockResult search(@RequestParam String query){
        log.debug("hi");
        MockParams params = new MockParams(query);
        return mockService.search(params);
    }

}
