package com.example.viewadapter;

import java.util.ArrayList;

public class Movie {

    private String movieName;
    private ArrayList<String> movieActors;
    private int yearMade;

    public Movie() {

    }

    public Movie(String movieName, ArrayList<String> movieActors, int yearmade) {
        this.movieName = movieName;
        this.movieActors = movieActors;
        this.yearMade = yearmade;
    }

    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public ArrayList<String> getMovieActors(){
        return movieActors;
    }
    public void setMovieActors(ArrayList<String> movieActors) {
        this.movieActors = movieActors;
    }

    public int getYearMade() {
        return yearMade;
    }
    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

}
