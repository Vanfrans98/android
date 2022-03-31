package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivitySecond extends AppCompatActivity {

    EditText editEmail;
    EditText editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitysecond);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);


    }

    public void login(View view) {
        UserModel user = new UserModel();
        user.setEmail(editEmail.getText().toString());
        user.setPassword(editPassword.getText().toString());

        Intent intent = new Intent(this, Home.class);
        intent.putExtra("user", user);
        startActivity(intent);
        finish();

    }
}