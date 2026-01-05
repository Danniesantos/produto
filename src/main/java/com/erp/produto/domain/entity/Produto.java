package com.erp.produto.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preco")
    private BigDecimal preco;
    @Enumerated(EnumType.STRING)
    @Column(name = "categoria")
    private CategoriaProduto categoria;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusProduto status;


}
