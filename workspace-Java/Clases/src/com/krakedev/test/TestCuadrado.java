package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado();
        Cuadrado c3 = new Cuadrado();
        
        double a1 = c1.obtenerArea(4);
        double a2 = c2.obtenerArea(10);
        double a3 = c3.obtenerArea(12);
        double p1 = c1.obtenerPerimetro(4);
        double p2 = c2.obtenerPerimetro(10);
        double p3 = c3.obtenerPerimetro(12);
        
        System.out.println("Area de c1: " + a1);        
        System.out.println("Area de c2: " + a2);       
        System.out.println("Area de c3: " + a3);        
        System.out.println("Perimetro de c1: " + p1);
        System.out.println("Perimetro de c2: " + p2);   
        System.out.println("Perimetro de c3: " + p3);  
    }
}
