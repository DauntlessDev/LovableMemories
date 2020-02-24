package com.example.lovablememories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MemoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memories);
        ImageView imgView1 = findViewById(R.id.imageView1);
        ImageView imgView2 = findViewById(R.id.imageView2);
        ImageView imgView3 = findViewById(R.id.imageView3);
        ImageView imgView4 = findViewById(R.id.imageView4);
        ImageView imgView5 = findViewById(R.id.imageView5);
        ImageView imgView6 = findViewById(R.id.imageView6);
        ImageView imgView7 = findViewById(R.id.imageView7);
        ImageView imgView8 = findViewById(R.id.imageView8);
        ImageView imgView9 = findViewById(R.id.imageView9);
        ImageView imgView10 = findViewById(R.id.imageView10);




        imgView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, RootActivity.class);
                startActivity(intent);
            }
        });
        imgView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, MusicActivity.class);
                startActivity(intent);
            }
        });
        imgView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, ArtsActivity.class);
                startActivity(intent);
            }
        });
        imgView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, PizzaActivity.class);
                startActivity(intent);
            }
        });
        imgView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, GamingActivity.class);
                startActivity(intent);
            }
        });
        imgView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, SinigangActivity.class);
                startActivity(intent);
            }
        });
        imgView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, RainActivity.class);
                startActivity(intent);
            }
        });
        imgView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, BondingActivity.class);
                startActivity(intent);
            }
        });
        imgView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, BooksActivity.class);
                startActivity(intent);
            }
        });
        imgView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MemoriesActivity.this, PeaceActivity.class);
                startActivity(intent);
            }
        });
    }
}
