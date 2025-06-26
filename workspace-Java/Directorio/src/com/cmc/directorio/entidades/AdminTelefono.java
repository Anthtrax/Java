package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora().equals("movi")) {
			telefono.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono[] telefonos) {
		int contador=0;
		for (Telefono t : telefonos) {
			if (t != null && t.getOperadora().equals("movi")) {
				contador++;
			}
		}
		return contador;
	}
public int contarClaro(Telefono[] telefonos) {
	int contador=0;
	for (Telefono t : telefonos) {
		if (t != null && t.getOperadora().equals("movi")) {
			contador++;
		}
	}
	return contador;
}
}
