package com.rishwanth99.MovieAPI.Movies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {

        List<Movie> movies = movieService.allMovies();
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMethodName(@PathVariable String imdbId) {

        Optional<Movie> movie = movieService.getMovieById(imdbId);

        return new ResponseEntity<Optional<Movie>>(movie, HttpStatus.OK);
    }
    
    
    
}
