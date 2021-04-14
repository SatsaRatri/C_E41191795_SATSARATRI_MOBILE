package com.example.minggu6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.minggu6_1.R;


public class User_detail extends AppCompatActivity {

    TextView name, email, city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);


        com.example.intent.user user = getIntent().getParcelableExtra("user");
        name.setText(user.getName() );
        email.setText(user.getEmail());

    }
}