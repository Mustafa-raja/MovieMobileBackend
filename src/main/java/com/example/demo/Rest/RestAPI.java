package com.example.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Cinemas;
import com.example.demo.Services.CinemaServices;

@RestController
@RequestMapping("/rest/controller/version/00002319")
public class RestAPI {

    @Autowired
    CinemaServices CS;

    @GetMapping("/allCinemas")
    public List<Cinemas> getAllCinemaList(){
        return CS.getAllCinemas();
    }

    @PostMapping("/PostACinema")
    public Cinemas postCinemas(@RequestParam String name, @RequestParam String latitude, @RequestParam String longitude)
    {
        return CS.addCinema(name, longitude, latitude);
    }
    @PostMapping("/AddMovieToCinema")
    public Cinemas addMovieToCinema(@RequestParam String name, @RequestParam String title, @RequestParam String poster, @RequestParam int id)
    {
        return CS.addMovieToCinema(name, title, poster, id);
    }
    

}
