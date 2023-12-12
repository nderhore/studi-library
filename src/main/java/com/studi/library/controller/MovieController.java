package com.studi.library.controller;

import com.studi.library.pojo.Movie;
import com.studi.library.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // REST (consommation et production de JSON)
@RequestMapping(ApiRegistration.API_REST + ApiRegistration.API_MOVIE)
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    List<Movie> findAllMovie(){
        return movieService.findAllMovie();
    }

    @PostMapping
    void createMovie(@RequestBody Movie movie){
        movieService.createMovie(movie);
    }

    @DeleteMapping("/{id}")
    void deleteMovieById(@PathVariable("id") Long id){
        movieService.deleteMovieById(id);
    }

    @PutMapping("/{id}")
    void updateMovieById(@RequestBody Movie newMovie, @PathVariable("id") Long id){
        movieService.updateMovieById(newMovie, id);
    }

    @PostMapping(ApiRegistration.API_MOVIE_LIST)
    void createAllMovies(@RequestBody List<Movie> movies){
        movieService.createAllMovies(movies);
    }



}
