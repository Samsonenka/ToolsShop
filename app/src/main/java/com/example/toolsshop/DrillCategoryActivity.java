package com.example.toolsshop;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DrillCategoryActivity extends AppCompatActivity {

    private ListView listViewDrills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_category);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        listViewDrills = findViewById(R.id.listViewDrills);

        ArrayList<Drill> drills = new ArrayList<>();
        drills.add(new Drill(getString(R.string.drill_dewalt_title), getString(R.string.drill_dewalt_info), R.drawable.dewalt));
        drills.add(new Drill(getString(R.string.drill_makita_title), getString(R.string.drill_makita_info), R.drawable.makita));
        drills.add(new Drill(getString(R.string.drill_bosch_title), getString(R.string.drill_bosch_info), R.drawable.bosch));

        ArrayAdapter<Drill> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, drills);
        listViewDrills.setAdapter(adapter);
    }
}
