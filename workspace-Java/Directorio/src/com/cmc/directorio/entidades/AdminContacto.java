package com.cmc.directorio.entidades;

public class AdminContacto {
    public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
        if (c1.getPeso() > c2.getPeso()) {
            return c1;
        }
        return c2;
    }

    public boolean compararOperadora(Contacto c1, Contacto c2) {
        if (c1 == null || c2 == null || c1.getTelefono() == null || c2.getTelefono() == null) {
            return false;
        }
        return c1.getTelefono().getOperadora().equals(c2.getTelefono().getOperadora());
    }

    public void activarUsuario(Contacto contacto) {
        if (contacto != null && contacto.getTelefono() != null && contacto.getTelefono().isTieneWhatsapp()) {
            contacto.setActivo(true);
        }
    }
}