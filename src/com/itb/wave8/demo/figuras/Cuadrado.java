package com.itb.wave8.demo.figuras;

public class Cuadrado extends FiguraGeometrica{

    private int lado;

    public Cuadrado() {
        this.lado = 0;
    }

    public Cuadrado(int radio) {
        this.lado = radio;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }
}
