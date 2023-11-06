package com.matuzalem.crudproduto.repository;

import com.matuzalem.crudproduto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
