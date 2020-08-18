package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button plusBtn,minus,multi,divi;
    String no1,no2;
    int val1,val2,sum;
    EditText editText1,editText2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        no1 = intent.getStringExtra("num1");
        no2 = intent.getStringExtra("num2");

        plusBtn = (Button)findViewById(R.id.button);
        minus = (Button)findViewById(R.id.button2);
        multi = (Button)findViewById(R.id.button4);
        divi = (Button)findViewById(R.id.button5);


        editText1 = findViewById(R.id.num1ino);
        editText2 = findViewById(R.id.num2in);
        editText1.setText(no1);
        editText2.setText(no2);


        result = findViewById(R.id.disnum);

        val1 = Integer.parseInt(no1);
        val2 = Integer.parseInt(no2);

        //result.setText(Integer.toString(val1));

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = val1+val2;
                result.setText(Integer.toString(sum));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = (val1-val2);
                result.setText(Integer.toString(sum));
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = val1*val2;
                result.setText(Integer.toString(sum));
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = (val1/val2);
                result.setText(Integer.toString(sum));
            }
        });

    }

}