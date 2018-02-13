package com.cice.supermercado.db.dtto;

import com.cice.supermercado.business.enums.EnumCategorias;

public class Producto {

    private String codigo;
    private String nombre;
    private EnumCategorias categoria;
    private Long stockage;

    public Producto() {
    }

    public Producto(String codigo, String nombre, EnumCategorias categoria, Long stockage) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stockage = stockage;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnumCategorias getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategorias categoria) {
        this.categoria = categoria;
    }

    public Long getStockage() {
        return stockage;
    }

    public void setStockage(Long stockage) {
        this.stockage = stockage;
    }
}
