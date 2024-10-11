package com.rishwanth99.MovieAPI;


import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    //imdbId
    Optional<Movie> findByImdbId(String imdbId);

    Optional<Movie> findMovieByImdbId(String imdbId);
     

}
