package com.test.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    @GetMapping("/1")
    public String get1() {
        return "Ham 1 Service 2";
    }

    @GetMapping("/2")
    public String get2() {
        return "Ham 2 Service 2";
    }
}
