package com.rogerioprojeto.gestao_confeitaria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá, Roro! Spring Boot tá funcionando!";
    }
}
