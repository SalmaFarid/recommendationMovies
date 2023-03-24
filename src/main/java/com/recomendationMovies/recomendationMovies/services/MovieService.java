package com.recomendationMovies.recomendationMovies.services;

import com.recomendationMovies.recomendationMovies.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private RestTemplate restTemplate;

    public List<Movie> getAllMovies() {
     //   String url = "http://localhost:8080/movies";
        // List<Movie> movies =new ArrayList<Movie>();

        // Movie movie1 = new Movie();
        // movie1.setId(1L);
        // movie1.setTitle("The Shawshank Redemption");
        // movie1.setGenre("Drama");
        // movie1.setReleaseYear(1994);
        // movie1.setDirector("Frank Darabont");
        // movies.add(movie1);

        // Movie movie2 = new Movie();
        // movie2.setId(2L);
        // movie2.setTitle("The Godfather");
        // movie2.setGenre("Drama");
        // movie2.setReleaseYear( 1972);
        // movie2.setDirector("Francis Ford Coppola");
        // movies.add(movie2);

        // Movie movie3 = new Movie();
        // movie3.setId(3L);
        // movie3.setTitle("The Dark Knight");
        // movie3.setGenre("Action");
        // movie3.setReleaseYear(2008);
        // movie3.setDirector("Christopher Nolan");
        // movies.add(movie3);
        ResponseEntity<Movie[]> response = restTemplate.getForEntity("/movies", Movie[].class);
       // ResponseEntity<Movie[]> response = restTemplate.getForEntity(url, Movie[].class);
        return Arrays.asList(response.getBody());
    }
}
