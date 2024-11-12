package com.juanca.microservicio.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="resultado-service",url = "http://localhost:8082")//indicamos que es un cliente Feign
public interface IResultadoClienteRest {
    
    @GetMapping("/operar/{resultado}")
    public String mostrarResultado(@PathVariable float resultado);
    
}
