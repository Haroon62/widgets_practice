package com.example.widgets_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DatePickerAndTimePicker extends AppCompatActivity {
TextView date;
DatePicker pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_and_time_picker);
        date=findViewById(R.id.date);
        pic=findViewById(R.id.pic);

    }
public void GetDate(View view){
    int day=pic.getDayOfMonth();
    int month=pic.getMonth();
    int year=pic.getYear();
    Toast.makeText(this, "Date:" +day+"/"+month+"/"+year, Toast.LENGTH_SHORT).show();

}
}