package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText editUsername, editPassword, editAngka1, editAngka2;
    TextView isiUsername, textHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAngka1 = findViewById(R.id.editAngka1);
        editAngka2 = findViewById(R.id.editAngka2);
        textHasil = findViewById(R.id.textHasil);

        editUsername = findViewById(R.id.editUsername);

        editPassword = findViewById(R.id.editPassword);

        isiUsername = findViewById(R.id.isiUsername);


        TextView text = findViewById(R.id.TextView);
        text.setText(new Date().toString());

        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = editUsername.getText().toString();
                String Password = editPassword.getText().toString();
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();
                isiUsername.setText(editUsername.getText());


            }

            public void  penambahan(View view) {
                int angka1 = Integer.parseInt(editAngka1.getText().toString());
                int angka2 = Integer.parseInt(editAngka2.getText().toString());
                textHasil.setText(String.valueOf(angka1+angka2));
            }
        });


    }
}