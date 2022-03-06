package com.test.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

    @GetMapping("/1")
    public String get1() {
        return "Ham 1 Service 1";
    }

    @GetMapping("/2")
    public String get2() {
        return "Ham 2 Service 1";
    }
}
