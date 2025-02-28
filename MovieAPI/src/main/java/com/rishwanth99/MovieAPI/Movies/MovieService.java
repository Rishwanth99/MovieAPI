package com.rishwanth99.MovieAPI.Movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> allMovies() {
         
        return movieRepository.findAll();
    }

    //get movie by id
    public Optional<Movie> getMovieById(String imdbId) {

        return movieRepository.findByImdbId(imdbId);
    }
}
