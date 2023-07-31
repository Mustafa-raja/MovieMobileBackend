package com.example.demo.Entities;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Cinemas {
    
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String longitude;
    private String latitude;

    @ManyToMany
    private List<Movie> movie;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public List<Movie> getMovie() {
        return movie;
    }
    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }
   
}
