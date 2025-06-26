package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

    public static void main(String[] args) {

        Telefono[] telefonos = new Telefono[3];
        telefonos[0] = new Telefono("movi", "0979376266", 10);
        telefonos[1] = new Telefono("claro", "0963390526", 25);
        telefonos[2] = new Telefono("tuenti", "0987826371", 14);

        AdminTelefono admin = new AdminTelefono();

        int resultado = admin.contarMovi(telefonos);

        System.out.println("Cantidad de teléfonos con operadora movi: " + resultado);
    }
}