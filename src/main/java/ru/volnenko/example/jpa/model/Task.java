package ru.volnenko.example.jpa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Task {

    @Id
    private String id = UUID.randomUUID().toString();

    @Column
    private String name = "";

    @Column
    private Date dateStart;

    @Column
    private Date dateFinish;

}
