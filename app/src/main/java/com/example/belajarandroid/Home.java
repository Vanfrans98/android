package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView textEmail;
    TextView textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textEmail = findViewById(R.id.textEmail);
        textPassword = findViewById(R.id.textPassword);

        UserModel user = getIntent().getExtras().getParcelable("user");
        textEmail.setText(user.getEmail());
        textPassword.setText(user.getPassword());

    }
}