package com.recomendationMovies.recomendationMovies.controllers;

import com.recomendationMovies.recomendationMovies.models.Movie;
import com.recomendationMovies.recomendationMovies.services.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecommendationController {
    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/recommendations")
    public List<Movie> getRecommendations(@RequestParam String genre) {
        System.out.println(genre);
        return recommendationService.getRecommendedMovies(genre);
    }
}
