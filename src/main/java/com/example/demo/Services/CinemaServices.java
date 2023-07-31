package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Cinemas;
import com.example.demo.Entities.Movie;
import com.example.demo.Repos.CinemasRepo;
import com.example.demo.Repos.MovieRepo;

@Service
public class CinemaServices {
    
    @Autowired
    CinemasRepo CR;

    @Autowired
    MovieRepo MR;

    public List<Cinemas> getAllCinemas() {
        return CR.findAll();
    }
    
    public Cinemas addCinema( String Cinema_name, String longitude, String latitude)
    {
        Cinemas cinema = new Cinemas();
        cinema.setName(Cinema_name);
        cinema.setLatitude(latitude);
        cinema.setLongitude(longitude);
        CR.save(cinema);
        return cinema;
    }

    public Cinemas addMovieToCinema(String Cinema_name, String Movie_title, String PosterPath, int Movieid)
    {
        Movie movie;
        Cinemas cinema = CR.findByName(Cinema_name);
        System.out.println(MR.findByTitle(Movie_title));
        if(MR.findByTitle(Movie_title) != null){
            movie = MR.findByTitle(Movie_title);
            List<Movie> list = cinema.getMovie();
            list.add(movie);
            cinema.setMovie(list);  
        }
        else{
            System.out.println("INSIDE ELSE");
            movie = new Movie();
            movie.setTitle(Movie_title);
            movie.setPoster_path(PosterPath);
            movie.setId(Movieid);
            MR.save(movie);
            List<Movie> list = cinema.getMovie();
            list.add(movie);
            cinema.setMovie(list);
        }
        
        CR.save(cinema);
        return cinema;
    }
}
