package com.krakedev;

public class Mensajeria {
    private void saludar() {
        System.out.println("Hola HUMANOS");
    }

    private void saludarAmigo(String nombre, String apellido) {
        System.out.println("Hola " + nombre + " " + apellido);
    }

    public void enviarSaludoGeneral() {
        saludar();
    }

    public void enviarSaludoPersonalizado(String nombre, String apellido) {
        saludarAmigo(nombre, apellido);
    }
}
