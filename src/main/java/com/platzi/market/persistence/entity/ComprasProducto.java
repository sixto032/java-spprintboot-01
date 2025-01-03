package com.platzi.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_productos")

public class CompraProducto {

    @EmbeddedId
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_producto")
    private Integer idProducto;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

}
