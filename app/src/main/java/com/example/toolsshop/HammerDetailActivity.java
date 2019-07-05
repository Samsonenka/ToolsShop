package com.example.toolsshop;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HammerDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hammer_detail);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        TextView textViewInfo = findViewById(R.id.textViewInfo);
        ImageView imageView = findViewById(R.id.imageViewHammer);

        Intent intent = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("imgResID")){
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int imgResID = intent.getIntExtra("imgResID", -1);

            textViewTitle.setText(title);
            textViewInfo.setText(info);
            imageView.setImageResource(imgResID);
        } else {
            Intent bakToCategory = new Intent(this, DrillCategoryActivity.class);
            startActivity(bakToCategory);
        }
    }
}
