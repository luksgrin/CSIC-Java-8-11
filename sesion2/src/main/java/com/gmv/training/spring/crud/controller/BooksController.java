package com.gmv.training.spring.crud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/books")
public class BooksController {

	
    @GetMapping("")
    public @ResponseBody String get() {
        return "hola Mundo!";
    }
}
