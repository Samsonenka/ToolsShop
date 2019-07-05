package com.example.toolsshop;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.toolsshop.models.Hammer;

import java.util.Arrays;
import java.util.List;

public class HammerCategoryActivity extends AppCompatActivity {

    private ListView listViewHammer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hammer_category);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        listViewHammer = findViewById(R.id.listViewHammer);

        final List<Hammer> hammers = Arrays.asList(
                new Hammer(getString(R.string.drill_jobi_title), getString(R.string.drill_jobi_info), R.drawable.jobi),
                new Hammer(getString(R.string.drill_fiberglass_title), getString(R.string.drill_fiberglass_info), R.drawable.fiberglass)
        );

        ArrayAdapter<Hammer> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, hammers);
        listViewHammer.setAdapter(adapter);

        listViewHammer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Hammer hammer = hammers.get(position);

                Intent intent = new Intent(getApplicationContext(), HammerDetailActivity.class);
                intent.putExtra("title", hammer.getTitle());
                intent.putExtra("info", hammer.getInfo());
                intent.putExtra("imgResID", hammer.getImgResID());
                startActivity(intent);
            }
        });
    }
}
