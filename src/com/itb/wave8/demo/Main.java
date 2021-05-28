package com.itb.wave8.demo;

import com.itb.wave8.demo.contrasenas.Password;
import com.itb.wave8.demo.contrasenas.*;
import com.itb.wave8.demo.figuras.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Password simplePassword = new SimplePassword();
        simplePassword.setValue("12345678");
        //simplePassword.setValue("12345");

        Password interPassword = new IntermediatePassword();
        interPassword.setValue("Contrasena");
        //interPassword.setValue("contra");

        Password strongPassword = new StrongPassword();
        strongPassword.setValue("Contrasena1$");
        //strongPassword.setValue("1234");

        FiguraGeometrica circulo = new Circulo(10);
        FiguraGeometrica cuadradro = new Cuadrado(5);
        FiguraGeometrica rectangulo = new Rectangulo(4,5);
        FiguraGeometrica triangulo = new Triangulo(5,7);

        FiguraGeometrica figuras[] = {circulo,cuadradro,rectangulo,triangulo};

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("El area de la figura " + (i+1) + " es : " + figuras[i].area());
        }

        System.out.println(FigurasUtil.calcularAreaPromedio(figuras));
    }
}
