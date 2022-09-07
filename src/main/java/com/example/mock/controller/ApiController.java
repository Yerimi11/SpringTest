package com.example.mock.controller;

//import com.example.mock.wishlist.dto.WishListDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // 로거 추가
@RestController
@RequestMapping("/api/restaurant")
@RequiredArgsConstructor
public class ApiController {
    
//    private final WishListService wishListService;

    @GetMapping("/search")
    public String search(@RequestParam String query){
        return "aaa";
    }

}
