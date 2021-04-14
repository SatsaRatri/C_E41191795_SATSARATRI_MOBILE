package com.example.minggu6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PindahDenganObjek extends AppCompatActivity implements View.OnClickListener {

    private EditText name, age, email, city;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_dengan_objek);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.submit) {
            String inputName = name.getText().toString().trim();
            String inputEmail = email.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(inputName)) {
                isEmptyFields = true;
                name.setError("Field ini tidak boleh kosong");
            }

            if (TextUtils.isEmpty(inputEmail)) {
                isEmptyFields = true;
                email.setError("Field ini tidak boleh kosong");
            }

            if (!isEmptyFields) {
                com.example.intent.user usr = new com.example.intent.user(inputName, inputEmail);

                Intent intent = new Intent(PindahDenganObjek.this, User_detail.class);
                intent.putExtra("user", usr);
                startActivity(intent);
            }
        }
    }
}