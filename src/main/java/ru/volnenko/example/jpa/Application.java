package ru.volnenko.example.jpa;

import ru.volnenko.component.jpa.endpoint.Endpoints;

public class Application {

    public static void main(String[] args) {
        Endpoints
                .create(Application.class)
                .emf("ENTERPRISE")
                .start();
    }

}
