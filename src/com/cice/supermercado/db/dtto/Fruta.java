package com.cice.supermercado.db.dtto;

import com.cice.supermercado.business.enums.EnumCategorias;

public class Fruta extends Producto{

    public Fruta(EnumCategorias categoria) {
        super();
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
     * @param baseCodigo
     * @return codigoProducto
     */

    private  String generarCodigoProducto(String baseCodigo){
        String codigoProducto = null;



        return codigoProducto;

    }



}
