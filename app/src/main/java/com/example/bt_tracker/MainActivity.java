package com.example.bt_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLog_activity(View view) {
        Intent toLog = new Intent(this, Log_activity.class);
        startActivity(toLog);
    }


    public void goToNormal_activity(View view) {
        Intent toNorm = new Intent(this, Normal_activity.class);
        startActivity(toNorm);
    }

    public void goToMechanism_activity(View view) {
        Intent toMecha = new Intent(this, Mechanism_activity.class);
        startActivity(toMecha);
    }

    public void goToHandling_activity(View view) {
        Intent toHand = new Intent(this, Handling_activity.class);
        startActivity(toHand);
    }
}





