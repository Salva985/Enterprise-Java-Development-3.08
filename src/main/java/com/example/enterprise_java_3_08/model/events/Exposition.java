package com.example.enterprise_java_3_08.model.events;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "expositions")
public class Exposition extends Event {

    public Exposition() {}

    public Exposition(LocalDate date, int duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }
}