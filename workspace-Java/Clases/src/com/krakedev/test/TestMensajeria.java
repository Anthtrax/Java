package com.krakedev.test;

import com.krakedev.Mensajeria;

public class TestMensajeria {

    public static void main(String[] args) {
        Mensajeria m;
        m = new Mensajeria();
        m.enviarSaludoGeneral();
        m.enviarSaludoPersonalizado("Pepe", "Chavez");
    }
}
