package tn.enig.service;

import jakarta.xml.ws.Endpoint;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:5500/", new JaxWS());
    }
}