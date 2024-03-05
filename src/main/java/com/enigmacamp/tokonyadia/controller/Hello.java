package com.enigmacamp.tokonyadia.controller;

import com.enigmacamp.tokonyadia.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class Hello {
    private List<Product> productList = new ArrayList<>();
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
    @PostMapping("/hello")
    public String helloo(){
        return "Helloo";
    }

    @GetMapping("/pathVar/{var}")
    public String pathvar(@PathVariable String var){
        return "path var: "+var;
    }

    @GetMapping("/queryStringVar")
    public String urlVar(@RequestParam String var){
        return "url var: "+var;
    }

    @PostMapping("/greetings")
    public String greet(@RequestBody String name){
        return String.format("Greetings %s!",name);
    }

    @GetMapping("/productData")
    public List<Product> getData(){
        return this.productList;
    }

}