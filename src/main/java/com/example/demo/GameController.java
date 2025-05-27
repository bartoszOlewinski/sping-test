package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class GameController {

    private List<Game> db = List.of(new Game());

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/games")
    public List<Game> getLibrary() {
        return db;
    }
}
