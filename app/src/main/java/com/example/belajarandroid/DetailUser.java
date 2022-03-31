package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailUser extends AppCompatActivity {

    TextView textUsername, textTanggalLahir, textNoHp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_user);

        textUsername = findViewById(R.id.textUsername);
        textTanggalLahir= findViewById(R.id.textTanggalLahir);
        textNoHp = findViewById(R.id.textNoHp);

        User1Model user1 = getIntent().getExtras().getParcelable("user1");
        textUsername.setText(user1.getUsername());
        textTanggalLahir.setText(user1.getTanggalLahir());
        textNoHp.setText(user1.getNoHp());
    }

    public void call(View view) {
        String data = textNoHp.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+data));
        startActivity(intent);
    }
}