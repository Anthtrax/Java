package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {
		    public static void main(String[] args) {
		        Telefono tel1 = new Telefono("claro", "111222333", 51); // Diferente operadora y número
		        Telefono tel2 = new Telefono("movi", "444555666", 51);   // Diferente operadora y número

		       
		        Contacto contacto1 = new Contacto("Lopez", tel1, 60.0);  
		        Contacto contacto2 = new Contacto("Rodriguez", tel2, 55.0);

		        System.out.println("Información de contacto 1: ");
		        System.out.println("Apellido: " + contacto1.getApellido());
		        System.out.println("Operadora: " + contacto1.getTelefono().getOperadora());
		        System.out.println("Número: " + contacto1.getTelefono().getNumero());


		        AdminContacto admin = new AdminContacto();


		        Contacto masPesado = admin.buscarMasPesado(contacto1, contacto2);
		        System.out.println("Contacto de mayor peso: ");
		        System.out.println("Apellido: " + masPesado.getApellido());
		        System.out.println("Peso: " + masPesado.getPeso());

 
		        boolean mismaOperadora = admin.compararOperadora(contacto1, contacto2);
		        System.out.println("¿Pertencen a la misma operadora? " + mismaOperadora);
		    }

	}
