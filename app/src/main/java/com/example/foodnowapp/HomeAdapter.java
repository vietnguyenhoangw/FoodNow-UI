package com.example.foodnowapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class HomeAdapter extends ArrayAdapter<Home> {

    Context context;
    int layout;
    ArrayList<Home> homeArrayList;


    public HomeAdapter(Context context, int resource, ArrayList<Home> objects) {
        super(context, resource, objects);

        this.context = context;
        this.layout = resource;
        this.homeArrayList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(layout, null);

        TextView txtHomeTitle = convertView.findViewById(R.id.txt_HomeTitle);
        TextView txtHomeLocation = convertView.findViewById(R.id.txt_HomeLocation);
        ImageView imgHomeImage = convertView.findViewById(R.id.img_HomeImage);

        Home home = homeArrayList.get(position);

        txtHomeTitle.setText(home.getHomeTitle());
        txtHomeLocation.setText(home.getHomeLocation());
        imgHomeImage.setImageResource(home.getHomeImage());

        return convertView;
    }
}
