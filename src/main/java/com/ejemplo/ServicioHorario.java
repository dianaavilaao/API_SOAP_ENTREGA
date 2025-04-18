package com.ejemplo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDate;

@WebService
public class ServicioHorario {

    @WebMethod
    public String getFecha() {
        return LocalDate.now().toString();
    }

    @WebMethod
    public String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }
}
