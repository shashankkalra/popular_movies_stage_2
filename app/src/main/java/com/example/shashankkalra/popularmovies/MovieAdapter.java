package com.example.shashankkalra.popularmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * MovieVO Adapter class
 *
 * @author shashankkalra
 */
public class MovieAdapter extends ArrayAdapter<MovieVO>{
    LayoutInflater inflater;
    Context context;
    MovieAdapter(Context context, int id, ArrayList<MovieVO> images){
        super(context, id, images);
        this.context=context;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final MovieVO movieVO =getItem(position);
        if(convertView==null){
            convertView=inflater.inflate(R.layout.list_item,parent,false);
        }
        ImageView image=(ImageView)convertView.findViewById(R.id.imageID);
        Picasso.with(context).load(movieVO.getImageUrl()).into(image);
        return convertView;
    }

}
