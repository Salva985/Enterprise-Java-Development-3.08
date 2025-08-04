package com.example.enterprise_java_3_08.model.nurses;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "chapters")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    // One-to-One relationship: Each Chapter has one President (Member)
    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    // One-to-Many relationship: Each Chapter has many Members
    @OneToMany
    @JoinColumn(name = "chapter_id") // Adds foreign key in members table
    private List<Member> members;

    // Empty constructor
    public Chapter() {}

    // Parameterized constructor
    public Chapter(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}