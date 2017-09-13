package aslabs.upcomingmovies;

import java.util.Date;

/**
 * Created by asif on 13/09/2017.
 */

public class Movie {

    long id;
    String title;
    String overView;
    float popularity;
    Date releaseDate;
    String image;
    String adultRating;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverView() {
        return overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAdultRating() {
        return adultRating;
    }

    public void setAdultRating(String adultRating) {
        this.adultRating = adultRating;
    }
}
