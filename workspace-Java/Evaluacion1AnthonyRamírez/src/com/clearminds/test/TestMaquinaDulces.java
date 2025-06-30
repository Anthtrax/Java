package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.maquina.Maquinadulces;

public class TestMaquinaDulces {
	    public static void main(String[] args) {
	    	Maquinadulces maquina = new Maquinadulces();
	        maquina.agregarCelda(new Celda("Celda1:"+"A"));
	        maquina.agregarCelda(new Celda("Celda2:"+"B"));
	        maquina.agregarCelda(new Celda("Celda3:"+"C"));
	        maquina.agregarCelda(new Celda("Celda4:"+"D"));
	        maquina.mostrarConfiguracion();
	    }
	}
