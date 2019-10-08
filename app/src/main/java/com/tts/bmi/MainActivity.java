package com.tts.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edHeight;
    private EditText edWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
      //  EditText nick = findViewById(R.id.editText2);
      //  nick.setText("123");
        edHeight = findViewById(R.id.height);
        edWeight = findViewById(R.id.weight);
    }

    public void bmi(View view){
        float height = Float.parseFloat(edHeight.getText().toString());
        float weight = Float.parseFloat(edWeight.getText().toString());
        float bmi = weight/(height*height);
        Log.d("MainActivity","BMI :"+bmi);
    }
}










