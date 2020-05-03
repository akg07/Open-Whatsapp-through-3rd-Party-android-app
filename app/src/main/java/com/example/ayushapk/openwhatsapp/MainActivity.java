package com.example.ayushapk.openwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button person1, person2, person3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person1 = findViewById(R.id.person1);
        person2 = findViewById(R.id.person2);
        person3 = findViewById(R.id.person3);

        person1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri_person_1 = Uri.parse("smsto: " + "1234567890");
                Intent i = new Intent(Intent.ACTION_SENDTO, uri_person_1);
                i.setPackage("com.whatsapp");
                startActivity(i);
            }
        });

        person2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri_person_2 = Uri.parse("smsto: " + "1478523690");
                Intent i = new Intent(Intent.ACTION_SENDTO, uri_person_2);
                i.setPackage("com.whatsapp");
                startActivity(i);
            }
        });

        person3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri_person_3 = Uri.parse("smsto: " + "15975386420");
                Intent t = new Intent(Intent.ACTION_SENDTO, uri_person_3);
                t.setPackage("com.whatsapp");
                startActivity(t);
            }
        });
    }
}
