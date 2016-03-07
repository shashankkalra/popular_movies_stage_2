package com.example.shashankkalra.popularmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MovieDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(getIntent().getExtras().getString("name"));
        TextView overview = (TextView) findViewById(R.id.overview);
        overview.setText(getIntent().getExtras().getString("overview"));
        TextView releaseDate = (TextView) findViewById(R.id.release);
        releaseDate.setText("Release Date : " + getIntent().getExtras().getString("releaseDate"));
        TextView rating = (TextView) findViewById(R.id.rating);
        rating.setText("Rating : " + getIntent().getExtras().getDouble("rating"));
        ImageView poster = (ImageView) findViewById(R.id.poster);
        String imageURL = "http://image.tmdb.org/t/p/w780/" + getIntent().getExtras().getString("url");
        Picasso.with(this).load(imageURL).resize(700, 780).into(poster);
    }
}
