package com.quinsic.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/messages")
    public String getMessages() {
        return "the protected messages";
    }
}
