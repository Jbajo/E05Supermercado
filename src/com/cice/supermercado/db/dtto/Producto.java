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

    private  String generarBaseCodigoProducto(EnumCategorias categoria){
        String baseCodigoProducto = null;
        baseCodigoProducto = categoria.getCodigoPais().concat("_").concat(categoria.getBaseCodigo());
        return baseCodigoProducto;
    }

    /**
     * Méotdo que me va a generar un código de 4 números dependiendo del nombre del producto
     * xxxx -> 1º país (8) -> 8xxx
     * 1019 -> 2º suma de estas cuatro cifras -> 11 -> si el numero es de 2 cifras sumamos estas -> 82xx     *
     * @param baseCodigoProducto --> Por ejemplo: 8_0001
     * @return codigoProducto
     */

    private  String generarCodigoProducto(String baseCodigoProducto){
        String codigoProducto = null;
        String [] datos =baseCodigoProducto.split("_");
        String random = String.valueOf(Math.floor(Math.random()*100));
        int aux = 0;
        int aux2 = 0;

        for (char c :datos[1].toCharArray()){
            aux +=c;
            if(String.valueOf(aux).length()>1){
                for(int d : String.valueOf(aux).toCharArray()){
                    aux2 +=d;
                }
                aux = aux2;

            }
        }
        codigoProducto = baseCodigoProducto.concat("_").concat(datos[0].concat(String.valueOf(aux)).concat(random));

        return codigoProducto;

    }
}
