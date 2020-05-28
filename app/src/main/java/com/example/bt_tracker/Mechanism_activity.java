package com.example.bt_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Mechanism_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanism_activity);
    }

    public void goTofall_in_LOVE(View view) {
        Intent TrueLOVE = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.shutterstock.com/ja/search/its+ok"));
        startActivity(TrueLOVE);
    }
}
