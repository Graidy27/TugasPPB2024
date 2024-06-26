package com.example.tugasppb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tugas3MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tugas3_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText firstNumberEditText = findViewById(R.id.firstNumber);
        EditText secondNumberEditText = findViewById(R.id.secondNumber);
        TextView textViewResult = findViewById(R.id.textViewResult);


        View.OnClickListener buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double firstNumber = Double.parseDouble(firstNumberEditText.getText().toString());
                    double secondNumber = Double.parseDouble(secondNumberEditText.getText().toString());
                    double hasil = 0;
                    String operator = "";

                    if (v.getId() == R.id.buttonAddition) {
                        hasil = firstNumber + secondNumber;
                        operator = getResources().getString(R.string.add);
                    } else if (v.getId() == R.id.buttonSubtraction) {
                        hasil = firstNumber - secondNumber;
                        operator = getResources().getString(R.string.subtract);
                    } else if (v.getId() == R.id.buttonMultiplication) {
                        hasil = firstNumber * secondNumber;
                        operator = getResources().getString(R.string.multiply);
                    } else if (v.getId() == R.id.buttonDivision) {
                        hasil = firstNumber / secondNumber;
                        operator = getResources().getString(R.string.divide);
                    }

                    textViewResult.setText(firstNumber + " " + operator + " " + secondNumber + " = " + hasil);
                }
                catch (Exception ignored) {
                    textViewResult.setText(R.string.error);
                }
            }
        };

        Button additionButton = findViewById(R.id.buttonAddition);
        Button subtractionButton = findViewById(R.id.buttonSubtraction);
        Button multiplicationButton = findViewById(R.id.buttonMultiplication);
        Button divisionButton = findViewById(R.id.buttonDivision);

        additionButton.setOnClickListener(buttonListener);
        subtractionButton.setOnClickListener(buttonListener);
        multiplicationButton.setOnClickListener(buttonListener);
        divisionButton.setOnClickListener(buttonListener);

    }
}