package com.example.exercicios.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class Calculadora {

    // /calculadora/somar/10/20
    // /calculadora/subtrair?a=100&b=39

    @GetMapping("/somar/{a}/{b}")
    public int soma(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return a - b;
    }
}