package com.example.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
    }

    public void buttonOnClick(View view) {
        Intent nextPage = new Intent(MainActivity.this, ProfilePage.class);
        startActivity(nextPage);
    }
}
