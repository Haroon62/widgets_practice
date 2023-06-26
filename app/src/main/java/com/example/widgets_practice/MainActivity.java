package com.example.widgets_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RatingBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar=findViewById(R.id.bar);
    }
    public void GetRating(View view){
       float f= bar.getRating();
        Toast.makeText(this, "Rating.."+f, Toast.LENGTH_SHORT).show();
    }
}