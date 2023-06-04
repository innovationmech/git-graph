package com.example.gitgraph;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    /**
     * a hello service
     * @return say hello
     */
    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }
}
