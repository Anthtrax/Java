package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		
        Telefono[] telefonos = new Telefono[4];
        telefonos[0] = new Telefono("movi", "0979376266", 10);
        telefonos[1] = new Telefono("claro", "0963390526", 25);
        telefonos[2] = new Telefono("claro", "0987826371", 14);
        telefonos[3] = new Telefono("movi", "0987876517", 36);
        
        AdminTelefono admin = new AdminTelefono();

        int resultado = admin.contarClaro(telefonos);

        System.out.println("Cantidad de teléfonos con operadora claro: " + resultado);
	}

}
