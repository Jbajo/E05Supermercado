package com.cice.supermercado.business.enums;

public enum EnumCategorias {

    PERECEDEROS_NACIONALES("0001","8"),
    PERECEDEROS_NO_NACIONALES("0001","4");

    private String baseCodigo;
    private String codigoPais;

    EnumCategorias(String baseCodigo, String codigoPais) {
        this.baseCodigo = baseCodigo;
        this.codigoPais = codigoPais;
    }

    public String getBaseCodigo(){
        return this.baseCodigo;
    }

    public String getCodigoPais(){
        return this.codigoPais;
    }
}
