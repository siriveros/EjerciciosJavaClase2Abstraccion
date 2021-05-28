package com.itb.wave8.demo.figuras;

public class Circulo extends FiguraGeometrica {

    private int radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
