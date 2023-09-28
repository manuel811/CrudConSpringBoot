package com.tienda.deportes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ciclismo {

    @GetMapping("/producs")
    public String productos(){

        return "Esto es un producto";
    }
}
