package com.recomendationMovies.recomendationMovies.services;

import com.recomendationMovies.recomendationMovies.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class RecommendationService {
    @Autowired
    private MovieService movieService;

    public List<Movie> getRecommendedMovies(String genre) {
        List<Movie> allMovies = movieService.getAllMovies();
        List<Movie> recommendedMovies = new ArrayList<Movie>();

        for (Movie movie : allMovies) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                recommendedMovies.add(movie);
            }
        }

        Collections.sort(recommendedMovies, new Comparator<Movie>() {
            public int compare(Movie m1, Movie m2) {
                return m2.getReleaseYear() - m1.getReleaseYear();
            }
        });

        return recommendedMovies;
    }
}
