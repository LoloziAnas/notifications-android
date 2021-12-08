package com.lzitech.notificationsdemoapp;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

public class NotificationActivity extends AppCompatActivity {

    private final String TAG = NotificationActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        findViewById(R.id.text_view_notification);
        Log.wtf(TAG, "onCreate: ");
    }
}