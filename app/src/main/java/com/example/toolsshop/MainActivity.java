package com.example.toolsshop;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.toolsshop.models.Hammer;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        listViewTools = findViewById(R.id.listViewTools);
        listViewTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intentDrill = new Intent(getApplicationContext(), DrillCategoryActivity.class);
                        startActivity(intentDrill);
                        break;
                    case 1:
                        Intent intentHammer = new Intent(getApplicationContext(), HammerCategoryActivity.class);
                        startActivity(intentHammer);
                        break;
                }
            }
        });
    }
}
