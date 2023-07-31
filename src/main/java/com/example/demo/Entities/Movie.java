package com.example.demo.Entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Movie {
    
    @Id
    private long id;

    private String poster_path;
    private String title;


    @ManyToMany
    private List<ShowTimes> showTimes;


    public List<ShowTimes> getShowTimes() {
        return showTimes;
    }
    public void setShowTimes(List<ShowTimes> showTimes) {
        this.showTimes = showTimes;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPoster_path() {
        return poster_path;
    }
    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
}
