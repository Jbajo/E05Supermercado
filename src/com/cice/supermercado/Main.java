package com.cice.supermercado;

import com.cice.supermercado.business.enums.EnumCategorias;
import com.cice.supermercado.db.dtto.Fruta;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Fruta pera = new Fruta(EnumCategorias.PERECEDEROS_NACIONALES);
        System.out.println(pera.toString());
    }
}
