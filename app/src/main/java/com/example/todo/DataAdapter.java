package com.example.todo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {
    Activity Context;
    int IdLayout;
    ArrayList<Data> mylist;
    public DataAdapter(Activity context, int idLayout, ArrayList<Data> studentArrayList){
        super(context, idLayout, studentArrayList);
        this.Context = context;
        IdLayout = idLayout;
        this.mylist = studentArrayList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mylayout = Context.getLayoutInflater();

        convertView = mylayout.inflate(IdLayout, null);

        Data student = mylist.get(position);

        TextView stt = convertView.findViewById(R.id.text_stt);
        TextView name = convertView.findViewById(R.id.text_name);
        CheckBox check = convertView.findViewById(R.id.check_box);
        TextView date = convertView.findViewById(R.id.text_date);
        if (student != null) {
            stt.setText(String.valueOf(student.getStt()));
            name.setText(String.valueOf(student.getTitle()));
            date.setText(String.valueOf(student.getDate()));
            check.setChecked((student.getCheck()));
        }
        return convertView;
    }
}
