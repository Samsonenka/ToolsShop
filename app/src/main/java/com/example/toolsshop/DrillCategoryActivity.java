package com.example.toolsshop;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.toolsshop.models.Drill;

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

        final ArrayList<Drill> drills = new ArrayList<>();
        drills.add(new Drill(getString(R.string.drill_dewalt_title), getString(R.string.drill_dewalt_info), R.drawable.dewalt));
        drills.add(new Drill(getString(R.string.drill_makita_title), getString(R.string.drill_makita_info), R.drawable.makita));
        drills.add(new Drill(getString(R.string.drill_bosch_title), getString(R.string.drill_bosch_info), R.drawable.bosch));

        ArrayAdapter<Drill> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, drills);
        listViewDrills.setAdapter(adapter);

        listViewDrills.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drill drill = drills.get(position);

                Intent intent = new Intent(getApplicationContext(), DrillDetailActivity.class);
                intent.putExtra("title", drill.getTitle());
                intent.putExtra("info", drill.getInfo());
                intent.putExtra("imgResID", drill.getImgResID());
                startActivity(intent);
            }
        });
    }
}
