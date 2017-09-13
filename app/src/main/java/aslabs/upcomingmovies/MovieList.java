package aslabs.upcomingmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MovieList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        ArrayList<Movie> movieArrayList = new ArrayList<>();
        ListView listView = findViewById(R.id.itemListView);

        Movie movie = new Movie();
        movie.setTitle("absdjasdf");
        movie.setReleaseDate(new Date());

        Movie movie1 = new Movie();
        movie1.setTitle("1");
        movie1.setReleaseDate(new Date());

        Movie movie2 = new Movie();
        movie2.setTitle("2");
        movie2.setReleaseDate(new Date());

        Movie movie3 = new Movie();
        movie3.setTitle("3");
        movie3.setReleaseDate(new Date());

        Movie movie4 = new Movie();
        movie4.setTitle("4");
        movie4.setReleaseDate(new Date());

        Movie movie5 = new Movie();
        movie5.setTitle("5");
        movie5.setReleaseDate(new Date());

        Movie movie6 = new Movie();
        movie6.setTitle("6");
        movie6.setReleaseDate(new Date());

        Movie movie7 = new Movie();
        movie7.setTitle("7");
        movie7.setReleaseDate(new Date());

        Movie movie8 = new Movie();
        movie8.setTitle("8");
        movie8.setReleaseDate(new Date());

        Movie movie9 = new Movie();
        movie9.setTitle("9");
        movie9.setReleaseDate(new Date());

        Movie movie10 = new Movie();
        movie10.setTitle("10");
        movie10.setReleaseDate(new Date());

        Movie movie11 = new Movie();
        movie11.setTitle("11");
        movie11.setReleaseDate(new Date());

        Movie movie12 = new Movie();
        movie12.setTitle("12");
        movie12.setReleaseDate(new Date());

        Movie movie13 = new Movie();
        movie13.setTitle("13");
        movie13.setReleaseDate(new Date());

        movieArrayList.add(movie);
        movieArrayList.add(movie1);
        movieArrayList.add(movie2);
        movieArrayList.add(movie3);
        movieArrayList.add(movie4);
        movieArrayList.add(movie5);
        movieArrayList.add(movie6);
        movieArrayList.add(movie7);
        movieArrayList.add(movie8);
        movieArrayList.add(movie9);
        movieArrayList.add(movie10);
        movieArrayList.add(movie11);
        movieArrayList.add(movie12);
        movieArrayList.add(movie13);

        MovieListAdapter movieListAdapter = new MovieListAdapter(movieArrayList, this);
        listView.setAdapter(movieListAdapter);

    }
}
