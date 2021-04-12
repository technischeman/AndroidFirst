package com.example.demirapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      ImageView ramadan=findViewById(R.id.ramadan);
      ramadan.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ramadan));


    }
}