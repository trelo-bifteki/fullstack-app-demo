package com.trelobifteki.demo.backend.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lambros on 29.10.18.
 */
@RestController
public class ApiController {

    @GetMapping("/api/username")
    public String getUsername() {
        return "Joe Doe";
    }

}
