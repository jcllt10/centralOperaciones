package com.microservicio.resultado.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController//controlador rest
public class ResultadoController {
    
    @GetMapping("/operar/{resultado}")
    public String mostrarResultado(@PathVariable float resultado)
    {
        return "El resultado es : " + resultado;
     }
    
}
