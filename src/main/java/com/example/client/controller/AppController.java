package com.example.client.controller;

import com.example.client.dto.AppDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping("/api1")
    public String call1(@RequestParam String param) {
        return "request with parameter: " + param;
    }

    // TODO check point: http.request.path_pattern, path_param
    @GetMapping("/api2/{pathVal}")
    public String call2(@PathVariable String pathVal) {
        return "request with path variable: " + pathVal;
    }

    // TODO check point: http.response.body.content(password masking)
    @PostMapping("/api3")
    public AppDto call3(@RequestBody AppDto appDto) {
        return appDto;
    }

    // TODO check point: console log ignored
    @GetMapping("/api4")
    public String call4() {
        return "logging ignored api";
    }

}
