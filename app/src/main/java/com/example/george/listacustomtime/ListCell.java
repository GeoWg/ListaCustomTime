package com.example.george.listacustomtime;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListCell extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] time;
    private final String[] cidade;
    private final Integer[] imageId;

    public ListCell(Activity context, String[] time, String[] cidade, Integer[] imageId){
        super(context, R.layout.activity_list_cell, time);
        this.context = context;
        this.time = time;
        this.cidade = cidade;
        this.imageId = imageId;
    }

        @Override
        public View getView(int position, View view, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.activity_list_cell, null, true);
            TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
            TextView txtCidade = (TextView) rowView.findViewById(R.id.txt2);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
            txtTitle.setText(time[position]);
            txtCidade.setText(cidade[position]);
            imageView.setImageResource(imageId[position]);
            return rowView;
        }
}