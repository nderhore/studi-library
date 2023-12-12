package com.studi.library.service.impl;

import com.studi.library.pojo.Movie;
import com.studi.library.repository.MovieRepository;
import com.studi.library.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie findMovieById(Long id) {
        // programmation fonctionnelle
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Movie> findAllMovie() {
        return movieRepository.findAll();
    }

    @Override
    public void updateMovieById(Movie movie, Long id) {
        // 1. recuperation du movie en base
        Movie oldMovie = this.findMovieById(id);

        //2. je verifie que mon oldMovie n'est pas vide
        if(oldMovie != null){

            //3. mise à jour des champs
            oldMovie.setDescription(movie.getDescription());
            oldMovie.setTitle(movie.getTitle());

            //4. je remet le oldMovie en base
            movieRepository.save(oldMovie);
        }
    }

    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public void createMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void createAllMovies(List<Movie> movies) {
        movieRepository.saveAll(movies);
    }
}
