package com.itb.wave8.demo.figuras;

import java.util.Arrays;

public class FigurasUtil {

    public static double calcularAreaPromedio(FiguraGeometrica figuras[]){
        double areaPromedio = 0;
        for(FiguraGeometrica figura:figuras){
            areaPromedio += figura.area();
        }
        areaPromedio /= figuras.length;
        return areaPromedio;
    }
}
