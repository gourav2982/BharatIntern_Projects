package com.example.quizzapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] arr;
    LayoutInflater inflter;
    public CustomAdapter(Context context, String[] arr) {
        this.arr=arr;
        this.context=context;
        inflter = (LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.spinner_bg, null);
        TextView text = (TextView) view.findViewById(R.id.textView);
        text.setText(arr[position]);
        return view;
    }
}
