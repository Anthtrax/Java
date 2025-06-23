package com.krakedev;

public class Cuadrado {
    private int lado;

    private double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    private double calcularPerimetro() {
        double resultado = lado * 4;
        return resultado;
    }

    private void setLadoInterno(int lado) {
        this.lado = lado;
    }

    public double obtenerArea(int lado) {
        setLadoInterno(lado);
        return calcularArea();
    }

    public double obtenerPerimetro(int lado) {
        setLadoInterno(lado);
        return calcularPerimetro();
    }
}