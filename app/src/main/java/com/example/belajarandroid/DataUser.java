package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataUser extends AppCompatActivity {

    EditText editUsername, editNoHp, editTanggalLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_user);

        editUsername = findViewById(R.id.editUsername);
        editNoHp = findViewById(R.id.editNoHp);
        editTanggalLahir = findViewById(R.id.editTanggalLahir);
    }



    public void submit(View view) {
        User1Model user1 = new User1Model();
        user1.setUsername(editUsername.getText().toString());
        user1.setNoHp(editNoHp.getText().toString());
        user1.setTanggalLahir(editTanggalLahir.getText().toString());

        Intent intent = new Intent(this, DetailUser.class);
        intent.putExtra("user1", user1);
        startActivity(intent);
        finish();
    }
}