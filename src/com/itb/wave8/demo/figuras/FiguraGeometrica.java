package com.itb.wave8.demo.figuras;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        return "El area de la figura es: " + area();
    }
}
