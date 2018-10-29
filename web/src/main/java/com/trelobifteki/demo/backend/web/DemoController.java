package com.trelobifteki.demo.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lambros on 27.10.18.
 */
@Controller
public class DemoController {

    @GetMapping("/")
    public String redirectToIndex() {
        return "redirect:index.html";
    }
}
