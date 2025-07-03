package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.DiasSemana;
import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.Util;

public class TestAlarmas {

	public static void main(String[] args) {
			Alarma a1=new Alarma(DiasSemana.LUNES,5,45);
			Alarma a2=new Alarma(DiasSemana.MARTES,2,48);
			Alarma a3=new Alarma(DiasSemana.MIERCOLES,8,10);
			
			AdminAlarmas ad=new AdminAlarmas();
			ad.agregarAlarma(a1);
			ad.agregarAlarma(a2);
			ad.agregarAlarma(a3);
			
			
			ArrayList<Alarma> alarmasActuales= ad.getAlarmas();
			
			for(int i=0;i<alarmasActuales.size();i++) {
				Alarma a=alarmasActuales.get(i);
				String dia=Util.formatearDia(a.getDia()-1);
				String hora=Util.formatearHora(a.getHora());
				System.out.println(dia+", "+hora+":"+a.getMinuto());
			}
		}
	}