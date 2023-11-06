package com.matuzalem.crudproduto.controller;

import com.matuzalem.crudproduto.dto.ProdutoDto;
import com.matuzalem.crudproduto.model.Produto;
import com.matuzalem.crudproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public String primeiroMetodo(){
        return produtoService.pimeiroMetodoService();
    }

    @PostMapping
    public String save(@RequestBody ProdutoDto produtoDto){
        String retorno = produtoService.save(produtoDto);
        return retorno;
    }
}

