package com.ejemplo;

import javax.xml.ws.Endpoint;

public class Publicador {
    public static void main(String[] args) {
        String url = "http://localhost:8080/servicio";
        System.out.println("Publicando en " + url);
        Endpoint.publish(url, new ServicioHorario());
    }
}
