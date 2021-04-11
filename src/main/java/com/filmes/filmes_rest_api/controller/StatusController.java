package com.filmes.filmes_rest_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class StatusController {

    @GetMapping(path = "/api/status")
    public String status(){
        return "online";
    }
}
