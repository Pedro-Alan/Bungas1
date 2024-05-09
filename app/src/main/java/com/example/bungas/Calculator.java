package com.example.bungas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void Sum(View v){
        EditText n1Txt = findViewById(R.id.editTextText);
        EditText n2Txt = findViewById(R.id.editTextText2);
        TextView resultTxt = findViewById(R.id.textView2);

        int n1 = Integer.parseInt(String.valueOf(n1Txt));
        int n2 = Integer.parseInt(n2Txt.toString());
        int result = n1 + n2;

        resultTxt.setText(n1 + " + " + n2 + " = " + result);
    }

    public void Sub(View v){

    }

    public void Div(View v){

    }
}