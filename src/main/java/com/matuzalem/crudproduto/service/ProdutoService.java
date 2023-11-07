package com.matuzalem.crudproduto.service;

import com.matuzalem.crudproduto.dto.ProdutoDto;
import com.matuzalem.crudproduto.model.Produto;
import com.matuzalem.crudproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public List<ProdutoDto> listar(){
        List<Produto> listarDeProdutos = produtoRepository.findAll();
        List<ProdutoDto> listarDto = new ArrayList<>();
        for (Produto produto: listarDeProdutos) {
            ProdutoDto produtoDto = new ProdutoDto();
            produtoDto.setId(produto.getId());
            produtoDto.setNome(produto.getNome());
            produtoDto.setValor(produto.getValor());
            listarDto.add(produtoDto);
        }
         return listarDto;
    }


    public String salvar(ProdutoDto produtoDto){
        Produto produto = new Produto();
        produto.setNome(produtoDto.getNome());
        produto.setValor(produtoDto.getValor());

        produtoRepository.save(produto);
        return "Produto salvo!";
    }


    public String alterar(ProdutoDto produtoDto){
        Produto produto = new Produto();
        produto.setId(produtoDto.getId());
        produto.setNome(produtoDto.getNome());
        produto.setValor(produtoDto.getValor());

        if(produto.getId() > 0){
            produtoRepository.save(produto);
            return "Produto alterado";
        }
        return "Produto nao alterado";

    }


    public String apagar(ProdutoDto produtoDto){
        Produto produto = new Produto();
        produto.setId(produtoDto.getId());
        produto.setNome(produtoDto.getNome());
        produto.setValor(produtoDto.getValor());

        produtoRepository.delete(produto);
        return "Produto apagado!";
    }
}
