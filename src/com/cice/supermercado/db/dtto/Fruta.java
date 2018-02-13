package com.cice.supermercado.db.dtto;

import com.cice.supermercado.business.enums.EnumCategorias;

public class Fruta extends Producto{

    public Fruta(EnumCategorias categoria) {
        this.setCategoria(categoria);
        this.setCodigo(this.generarCodigoProducto(this.generarBaseCodigoProducto(categoria)));
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

    @Override
    public String toString() {
        return "El codigo del producto es ---> " + this.getCodigo();
    }
}
