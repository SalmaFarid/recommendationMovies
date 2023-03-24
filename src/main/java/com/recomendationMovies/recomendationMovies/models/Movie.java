package com.recomendationMovies.recomendationMovies.models;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private String director;

    // getters and setters

    public int getReleaseYear() {
        return this.releaseYear;
    }
    public void setReleaseYear(int input) {
        this.releaseYear = input;
    }

    public String getDirector() {
        return this.director;
    }
    public void setDirector(String input) {
        this.director = input;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long input) {
        this.id = input;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String input) {
        this.title = input;
    }

    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String input) {
        this.genre = input;
    }

}
