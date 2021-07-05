package com.tata.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DrillCategoryActivity extends AppCompatActivity {

    private ListView listViewDrills;
    private ArrayList<Drill> drills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_category);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        drills = new ArrayList<>();
        drills.add(new Drill(getString(R.string.drill_1_title), getString(R.string.drill_1_info), R.drawable.drill_1));
        drills.add(new Drill(getString(R.string.drill_2_title), getString(R.string.drill_2_info), R.drawable.drill_2));
        drills.add(new Drill(getString(R.string.drill_3_title), getString(R.string.drill_3_info), R.drawable.drill_3));
        listViewDrills = findViewById(R.id.listViewDrills);
        ArrayAdapter<Drill> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, drills);
        listViewDrills.setAdapter(adapter);

        listViewDrills.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drill drill = drills.get(position);
                Intent intent = new Intent(getApplicationContext(), DrillDetailActivity.class);
                intent.putExtra("title", drill.getTitle());
                intent.putExtra("info", drill.getInfo());
                intent.putExtra("resId", drill.getResImgId());
                startActivity(intent);
            }
        });
    }
}