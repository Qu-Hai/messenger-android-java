package com.example.appchat_hk5;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class GenerationActivity extends AppCompatActivity {
    public void openNewActivity(Class destActivity) {
        Intent intent = new Intent(this, destActivity);
        startActivity(intent);
    }
}