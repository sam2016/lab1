package com.lab1.demo.controllers;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {

@GetMapping("/")
@ResponseBody
public Map<String,Object> index(){
    return Map.of("status",true,"message","Cool vs COde");
}

}