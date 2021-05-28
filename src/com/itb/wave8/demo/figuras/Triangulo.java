package com.itb.wave8.demo.figuras;

public class Triangulo extends FiguraGeometrica {

    private int base;
    private int altura;

    public Triangulo() {
        this.base=0;
        this.altura = 0;
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura)/2;
    }
}
