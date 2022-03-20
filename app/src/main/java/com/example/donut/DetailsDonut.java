package com.example.donut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsDonut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_b);
        String txtName = getIntent().getExtras().getString("name");
        String txtDes = getIntent().getExtras().getString("des");
        String txtPrice = getIntent().getExtras().getString("price");
        int imgMain = getIntent().getExtras().getInt("img");

        TextView txtNameView = findViewById(R.id.txtName);
        TextView txtPriceView = findViewById(R.id.txtPrice);
        TextView txtDesView = findViewById(R.id.txtDes);
        ImageView imgViewMain = findViewById(R.id.imgMain);
        txtNameView.setText(txtName);
        txtDesView.setText(txtDes);
        txtPriceView.setText(txtPrice);

        imgViewMain.setImageResource(imgMain);
    }
}