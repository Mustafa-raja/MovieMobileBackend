package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Cinemas;


public interface CinemasRepo extends JpaRepository<Cinemas, Integer> {
    
    public Cinemas findByName(String name);
}
