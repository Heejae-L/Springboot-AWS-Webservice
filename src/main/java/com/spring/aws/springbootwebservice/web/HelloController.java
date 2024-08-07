package com.spring.aws.springbootwebservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //JSON을 반환하는 컨트롤러로 만듦 @ResponseBody 대신 사용
public class HelloController {
    @GetMapping("/hello") //Get의 요청을 받을 수 있는 API만듦
    public String hello() {
        return "hello";
    }
}
