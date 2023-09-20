package com.example.dataproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText phone;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // marge with the ids

        //how to pass data from one activity to activity,TOPIC

        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_email_address);
        phone = findViewById(R.id.et_phone_number);

        signup = findViewById(R.id.signup_button);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                int userPhone = Integer.valueOf(phone.getText().toString());

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("name",userName);
                i.putExtra("email",userEmail);
                i.putExtra("phone",userPhone);
                startActivity(i);


            }
        });
    }
}