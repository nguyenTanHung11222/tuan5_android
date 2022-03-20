package com.example.donut;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DonutAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<Donut> listDonut;

    public DonutAdapter(Context context, int layout, List<Donut> listDonut) {
        this.context = context;
        this.layout = layout;
        this.listDonut = listDonut;
    }

    @Override
    public int getCount() {
        return listDonut.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        TextView txtHeader = view.findViewById(R.id.textView_Header);
        TextView txtDes = view.findViewById(R.id.textView_des);
        TextView txtPrice = view.findViewById(R.id.textView_Price);
        ImageView imgMain = view.findViewById(R.id.imgView_main);

        Donut donutItem = listDonut.get(i);
        txtHeader.setText(donutItem.getDonutName());
        txtDes.setText(donutItem.getDonutDes());
        txtPrice.setText(donutItem.getDonutPrice());
        imgMain.setImageResource(donutItem.getDonutImg());

        return view;
    }
}
