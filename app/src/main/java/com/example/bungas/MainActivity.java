package com.example.bungas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowMessage(View v){
        TextView text = findViewById(R.id.textView);
        text.setText("Za Warudo: Ova Hebun");
    }

    public void switchTheme(){
        Switch toggle = (Switch) findViewById(R.id.switch1);
    }
}