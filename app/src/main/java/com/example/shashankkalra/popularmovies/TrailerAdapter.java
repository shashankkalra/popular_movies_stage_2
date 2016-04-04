package com.example.shashankkalra.popularmovies;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * MovieVO Adapter class
 *
 * @author shashankkalra
 */
public class TrailerAdapter extends ArrayAdapter<TrailerVO>{
    LayoutInflater inflater;
    Context context;
    TrailerAdapter(Context context, int id, ArrayList<TrailerVO> trailerVOs){
        super(context, id, trailerVOs);
        this.context=context;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final TrailerVO trailerVO =getItem(position);
        if(convertView==null){
            convertView=inflater.inflate(R.layout.trailer_item,parent,false);
        }
        TextView trailer=(TextView)convertView.findViewById(R.id.trailer_item);
        String linkText = "<a href='"+trailerVO.getURL()+"'>Watch "+trailerVO.getName()+"</a>";
        trailer.setText(Html.fromHtml(linkText));
        trailer.setMovementMethod(LinkMovementMethod.getInstance());
        return convertView;
    }

}
