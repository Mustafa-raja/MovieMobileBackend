package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Movie;


public interface MovieRepo extends JpaRepository<Movie,Integer> {
    
    public Movie findByTitle(String title);
}
