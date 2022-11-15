package com.dcc.moive_api.service;

import com.dcc.moive_api.data.Movie;
import com.dcc.moive_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie updateMovieById(Integer id, Movie newMovie){
        Movie movieToUpdate = movieRepository.findById(id).orElse(null);
        movieToUpdate.setName(newMovie.getName());
        movieToUpdate.setGenre(newMovie.getGenre());
        movieToUpdate.setDirector(newMovie.getDirector());
        movieRepository.save(movieToUpdate);

        return movieToUpdate;
    }

    public Movie deleteMovieById(Integer id){
        Movie movieToDelete = movieRepository.findById(id).orElse(null);
        movieRepository.deleteById(id);
        return movieToDelete;
    }

    public Movie getById(Integer id){
        return movieRepository.findById(id).orElse(null);
    }

    public List<Movie> getByGenre(String genre){
        return movieRepository.findByGenre(genre);
    }

    public Movie getByName(String name){
        return movieRepository.findByName(name);
    }
}
