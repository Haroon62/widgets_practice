package com.example.widgets_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class datepicker extends AppCompatActivity {
TextView date2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
        date2=findViewById(R.id.date2);
        date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog=new DatePickerDialog( DatePicke , new DatePickerDialog.OnDateSetListener())
            }
        });
    }
}