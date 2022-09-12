package com.example.mock.controller;

//import com.example.mock.wishlist.dto.WishListDto;

import com.example.mock.model.MockParams;
import com.example.mock.model.MockResult;
import com.example.mock.service.MockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // 로거 추가
@RestController
@RequestMapping("/api")
public class MockController {

    private final MockService mockService;

    public MockController(MockService mockService) {
        this.mockService = mockService;
    }

    @GetMapping("/mock")
    public MockResult search(@RequestParam String query){
        MockParams params = new MockParams(query);
        MockResult result = mockService.search(params);
        log.debug("result: {}", result);
//        System.out.println(result);
        return result;

    }

}
