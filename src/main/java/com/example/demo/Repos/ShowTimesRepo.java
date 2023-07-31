package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.ShowTimes;

public interface ShowTimesRepo extends JpaRepository<ShowTimes,Integer>{
    
}
