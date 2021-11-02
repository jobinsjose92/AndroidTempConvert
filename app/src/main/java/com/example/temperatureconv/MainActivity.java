package com.example.temperatureconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToCelsius(View v)
    {
        EditText t1 = (EditText)findViewById(R.id.editTextNumber2);
        EditText result = (EditText)findViewById(R.id.editTextNumber3);

        int fahren = Integer.parseInt(t1.getText().toString());
        double conv =  Math.round((fahren - 32.0) * (5.0/9.0));

        result.setText(""+conv);
    }

}