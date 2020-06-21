package com.example.bt_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private AlarmManager alarmManager;

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


            case R.id.setReminder:
                // setReminderButton push push, do something something
                Toast.makeText(this, "Reminder set!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MyReceiver.class);
                PendingIntent pd = PendingIntent.getBroadcast(this, 0, intent, 0);
                AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
                long interval = 1000 * 2;
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(), interval, pd);
                break;



        }

    }


    private void createNotificationChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            String channelID = "BT_Tracker_Channel";
            String channelName = "BTTrackerReminderChannel";
            String channelDescription = "Channel for BT Tracker reminder";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(channelID, channelName, importance);
            channel.setDescription(channelDescription);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
            }
        }
    }






