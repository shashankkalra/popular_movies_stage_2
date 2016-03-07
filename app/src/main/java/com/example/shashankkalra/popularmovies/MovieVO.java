package com.example.shashankkalra.popularmovies;

/**
 * MovieVO VO
 *
 * @author shashankkalra
 */
public class MovieVO {

    String name, overview, imageUrl, releaseDate;
    final String BASE_URL = "http://image.tmdb.org/t/p/w342/";
    double rating;
    String fullURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getImageUrl() {
        return fullURL;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        fullURL = BASE_URL + imageUrl;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
