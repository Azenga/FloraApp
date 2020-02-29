package com.mysasse.floraapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Fruits List");
        }

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            startActivity(new Intent(this, RequestPermissionActivity.class));
        }

        FloatingActionButton gotoAddFruitActivityFab = findViewById(R.id.goto_add_fruit_activity_fab);

        gotoAddFruitActivityFab.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddFruitActivity.class);
            startActivity(intent);
        });

    }
}
