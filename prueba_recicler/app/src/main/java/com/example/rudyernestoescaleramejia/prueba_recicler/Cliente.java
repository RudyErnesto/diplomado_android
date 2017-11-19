package com.example.rudyernestoescaleramejia.prueba_recicler;

/**
 * Created by rudyernestoescaleramejia on 18/11/17.
 */

public class Cliente {
    private String email;
    private String password;
    public Cliente(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
