package com.example.enterprise_java_3_08.model.events;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "conference")
public class Conference extends Event {

    @OneToMany
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;

    public Conference() {}

    public Conference(LocalDate date, int duration, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(date, duration, location, title, guests);
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() { return speakers; }
    public void setSpeakers(List<Speaker> speakers) { this.speakers = speakers; }
}
