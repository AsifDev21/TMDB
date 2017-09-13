package aslabs.upcomingmovies;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by asif on 13/09/2017.
 */

public class MovieListAdapter extends BaseAdapter {

    ArrayList<Movie> movieArrayList;
    Context context;

    public MovieListAdapter(ArrayList<Movie> movieArrayList, Context context) {
        this.context = context;
        this.movieArrayList = movieArrayList;
    }

    @Override
    public int getCount() {
        return movieArrayList.size();
    }

    @Override
    public Movie getItem(int i) {
        return movieArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return movieArrayList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;

        // inflate the layout for each list row
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.movie_item_view, viewGroup, false);
            viewHolder = new ViewHolder(view);

        }
        Log.d(TAG, "getView: " + i);
        if (viewHolder != null) {
            viewHolder.tvMovieName.setText(movieArrayList.get(i).getTitle());
            viewHolder.tvReleasrDate.setText(movieArrayList.get(i).getReleaseDate().toString());
        }

        return view;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public class ViewHolder {
        ImageView ivMovieImage;
        ImageView ivRightArrow;
        TextView tvReleasrDate;
        TextView tvMovieName;
        TextView tvMovieRating;

        public ViewHolder(View view) {
            ivMovieImage = view.findViewById(R.id.ivMovieImage);
            ivRightArrow = view.findViewById(R.id.ivRightArrow);
            tvReleasrDate = view.findViewById(R.id.tvReleasrDate);
            tvMovieName = view.findViewById(R.id.tvMovieName);
            tvMovieRating = view.findViewById(R.id.tvMovieRating);
        }
    }

}
