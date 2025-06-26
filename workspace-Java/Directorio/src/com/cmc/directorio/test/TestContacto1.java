package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
    public static void main(String[] args) {
        
        Telefono tel1 = new Telefono("movi", "987654321", 51);
        Telefono tel2 = new Telefono("claro", "123456789", 51);

        Contacto contacto1 = new Contacto("Perez", tel1, 70.5);
        Contacto contacto2 = new Contacto("Gomez", tel2, 65.0);

        System.out.println("Información de contacto 1: ");
        System.out.println("Apellido: " + contacto1.getApellido());
        System.out.println("Operadora: " + contacto1.getTelefono().getOperadora());
        System.out.println("Número: " + contacto1.getTelefono().getNumero());

        AdminContacto admin = new AdminContacto();

        Contacto masPesado = admin.buscarMasPesado(contacto1, contacto2);
        System.out.println("\nContacto de mayor peso: ");
        System.out.println("Apellido: " + masPesado.getApellido());
        System.out.println("Peso: " + masPesado.getPeso());

        boolean mismaOperadora = admin.compararOperadora(contacto1, contacto2);
        System.out.println("\n¿Pertencen a la misma operadora? " + mismaOperadora);
    }
}