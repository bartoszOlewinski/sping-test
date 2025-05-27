package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class GameController {

    private List<Game> db = List.of(new Game("0", "test", "testfile"));

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/games")
    public List<Game> getLibrary() {
        return db;
    }

    @GetMapping("/games/{id}")
    public Game getGameById(@PathVariable String id) {
        return db.get(Integer.parseInt(id));
    }
}
