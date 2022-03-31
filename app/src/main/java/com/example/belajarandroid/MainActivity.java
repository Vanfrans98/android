package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText editUsername, editPassword, editAngka1, editAngka2, noTelp;
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

        noTelp = findViewById(R.id.noTelp);


        TextView text = findViewById(R.id.TextView);
        text.setText(new Date().toString());


    }


    public void selanjutnya(View view) {
        Intent intent = new Intent(this, ActivitySecond.class);
        startActivity(intent);
    }

    public void Submit(View view) {
        String Username = editUsername.getText().toString();
        String Password = editPassword.getText().toString();
        Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();
        isiUsername.setText(editUsername.getText());
    }

    public void tambah(View view) {
        int angka1 = Integer.parseInt(editAngka1.getText().toString());
        int angka2 = Integer.parseInt(editAngka2.getText().toString());
        textHasil.setText(String.valueOf(angka1+angka2));
    }

    public void kamera(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivity(intent);
    }


    public void telepon(View view) {
        String data = noTelp.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+data));
        startActivity(intent);
    }



}