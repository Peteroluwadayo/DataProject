package com.example.dataproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textViewName,textViewEmail,textViewPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewName = findViewById(R.id.tv_name);
        textViewEmail = findViewById(R.id.tvEmail);
        textViewPhone = findViewById(R.id.tv_phone);

        Intent i = getIntent();
        String userName = i.getStringExtra("name");
        String userEmail = i .getStringExtra("email");
        int userPhone = i.getIntExtra("phone",0);

        textViewName.setText("Hello" + userName);
        textViewEmail.setText(("Your email address is " + userEmail));
        textViewPhone.setText("Your phone number is " + String.valueOf(userPhone));

    }
}