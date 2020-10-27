package com.example.appchat_hk5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends GenerationActivity {
    private Button btnLogin, btnResigter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openNewActivity(ListChatActivity.class);
            }
        });
        btnResigter=findViewById(R.id.btnResigter);
        btnResigter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openNewActivity(ResigterActivity.class);
            }
        });
    }


}