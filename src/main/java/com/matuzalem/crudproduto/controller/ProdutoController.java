package com.matuzalem.crudproduto.controller;

import com.matuzalem.crudproduto.dto.ProdutoDto;
import com.matuzalem.crudproduto.model.Produto;
import com.matuzalem.crudproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoDto> listar(){
        return produtoService.listar();
    }

    @PostMapping
    public String salvar(@RequestBody ProdutoDto produtoDto){
        return produtoService.salvar(produtoDto);
    }

    @PutMapping
    public String alterar(@RequestBody ProdutoDto produtoDto){
        String retorno = produtoService.alterar(produtoDto);
        return retorno;
    }
    @DeleteMapping
    public String apagar(@RequestBody ProdutoDto produtoDto){
        String retorno = produtoService.apagar(produtoDto);
        return retorno;
    }

}

