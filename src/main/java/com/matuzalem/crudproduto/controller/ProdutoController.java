package com.matuzalem.crudproduto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @GetMapping
    public String Primeiro(){
        return "PRIMEIRO TESTE";
    }
}
