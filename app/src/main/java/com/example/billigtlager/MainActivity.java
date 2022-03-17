package com.example.billigtlager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToWebpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToWebpage = (Button) findViewById(R.id.GoToWebpage);

        goToWebpage.setOnClickListener(v -> {
            String action  = Intent.ACTION_VIEW;
            Uri uri = Uri.parse("http://www.Billigtlager.dk");

            Intent intent = new Intent(action, uri);
            startActivity(intent);
        });
    }
}