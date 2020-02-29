package com.mysasse.floraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddFruitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fruit);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Add Fruit");
        }
    }
}
