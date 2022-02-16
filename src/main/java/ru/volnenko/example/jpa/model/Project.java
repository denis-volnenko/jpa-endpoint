package ru.volnenko.example.jpa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Project {

    @Id
    private String id = UUID.randomUUID().toString();

    private String name = "";

}
