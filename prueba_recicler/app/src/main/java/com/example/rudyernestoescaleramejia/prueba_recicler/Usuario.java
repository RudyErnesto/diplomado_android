package com.example.rudyernestoescaleramejia.prueba_recicler;

/**
 * Created by rudyernestoescaleramejia on 9/10/17.
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String phone;

    public Usuario(String nombre, String correo, String phone) {
        this.nombre = nombre;
        this.correo = correo;
        this.phone = phone;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }
    public String getPhone(){return  phone;}

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setPhone(String phone){this.phone = phone;}
}

