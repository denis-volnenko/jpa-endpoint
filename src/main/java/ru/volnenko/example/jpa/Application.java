package ru.volnenko.example.jpa;

import ru.volnenko.component.jpa.endpoint.Endpoints;

public class Application {

    public static void main(String[] args) {
        Endpoints
                .create(Application.class)
                .emf("ENTERPRISE")

                .host("0.0.0.0").port(8080)
                .soap(true).rest(true).scan(true)

                .start();
    }

}
