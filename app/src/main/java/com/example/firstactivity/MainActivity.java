package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOK;
    Toast toast;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK = (Button)findViewById(R.id.btnOk);
        editText1 = findViewById(R.id.num1in);
        editText2 = findViewById(R.id.num2in);

    }

    @Override
    protected void onResume() {
        super.onResume();
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Loading";
                int duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context,text,duration);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("num1",editText1.getText().toString());
                intent.putExtra("num2",editText2.getText().toString());
                startActivity(intent);
            }
        });
    }

}