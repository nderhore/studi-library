package com.studi.library.service;

import com.studi.library.pojo.Movie;

import java.util.List;

public interface MovieService {

    Movie findMovieById(Long id);

    List<Movie> findAllMovie();

    void updateMovieById(Movie movie, Long id);

    void deleteMovieById(Long id);

    void createMovie(Movie movie);


    void createAllMovies(List<Movie> movies);
}
