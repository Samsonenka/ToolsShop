package com.example.toolsshop;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private TextView textViewInfo;
    private ImageView imageViewDrill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        textViewTitle = findViewById(R.id.textViewTitle);
        textViewInfo = findViewById(R.id.textViewInfo);
        imageViewDrill = findViewById(R.id.imageViewHammer);

        Intent intent = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("imgResID")){
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int resID = intent.getIntExtra("imgResID", -1);

            textViewTitle.setText(title);
            textViewInfo.setText(info);
            imageViewDrill.setImageResource(resID);
        } else {
            Intent bakToCategory = new Intent(this, DrillCategoryActivity.class);
            startActivity(bakToCategory);
        }
    }
}
