package com.example.bt_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainButton1 = findViewById(R.id.Button_1st);
        mainButton1.setOnClickListener(this);

        TextView mainButton2 = findViewById(R.id.Button_2nd);
        mainButton2.setOnClickListener(this);

        TextView mainButton3 = findViewById(R.id.Button_3rd);
        mainButton3.setOnClickListener(this);

        TextView mainButton4 = findViewById(R.id.Button_4th);
        mainButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.Button_1st:
                Intent toLog = new Intent(this, Log_activity.class);
                startActivity(toLog);
               // You can push!!!
                break;

            case R.id.Button_2nd:
                Intent toNorm = new Intent(this, Normal_activity.class);
                startActivity(toNorm);
                // It`s OK bro
                break;

            case R.id.Button_3rd:
                Intent toMecha = new Intent(this, Mechanism_activity.class);
                startActivity(toMecha);
                // It`s OK sis
                break;

            case R.id.Button_4th:
                Intent toHand = new Intent(this, Handling_activity.class);
                startActivity(toHand);
                //Yeah bro
                break;
        }

    }

}





