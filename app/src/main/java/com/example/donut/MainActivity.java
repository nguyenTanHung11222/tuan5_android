package com.example.donut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDonut;
    ArrayList<Donut> arrDonut;
    DonutAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        adapter = new DonutAdapter(this, R.layout.item_donuts, arrDonut);
        lvDonut.setAdapter(adapter);


        lvDonut.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailsDonut.class);
                Bundle b = new Bundle();
                b.putString("name", arrDonut.get(i).getDonutName());
                b.putString("des", arrDonut.get(i).getDonutDes());
                b.putString("price", arrDonut.get(i).getDonutPrice());
                b.putInt("img", arrDonut.get(i).getDonutImg());
                intent.putExtras(b);

                startActivity(intent);
            }
        });

    }

    private void mapping() {
        lvDonut = findViewById(R.id.listView_donutShow);
        arrDonut = new ArrayList<>();
        arrDonut.add(new Donut("Floating Donut", "Spicy tasty donut family", "$30.00", R.drawable.green_donut_1));
        arrDonut.add(new Donut("Tasty Donut", "Spicy tasty donut family", "$40.00", R.drawable.donut_red_1));
        arrDonut.add(new Donut("Tasty Donut", "Spicy tasty donut family", "$10.00", R.drawable.donut_yellow_1));
        arrDonut.add(new Donut("Pink Donut", "Spicy tasty donut family", "$20.00", R.drawable.pink_donut_1));
        arrDonut.add(new Donut("Floating Donut", "Spicy tasty donut family", "$30.00", R.drawable.green_donut_1));
        arrDonut.add(new Donut("Tasty Donut", "Spicy tasty donut family", "$40.00", R.drawable.donut_red_1));
    }
}