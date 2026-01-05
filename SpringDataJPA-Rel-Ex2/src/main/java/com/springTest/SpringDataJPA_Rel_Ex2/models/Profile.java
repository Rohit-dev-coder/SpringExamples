package com.springTest.SpringDataJPA_Rel_Ex2.models;

import jakarta.persistence.*;

@Entity
public class Profile {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String bio;
    @OneToOne(mappedBy = "profile")
    private User user;

    public Profile() {
    }

    public Profile(String bio) {
        this.bio = bio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}
