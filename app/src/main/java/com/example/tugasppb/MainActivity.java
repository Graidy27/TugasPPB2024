package com.example.tugasppb;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button buttonAssign1 = (Button) findViewById(R.id.b_assign_1);
        buttonAssign1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, Tugas1MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonAssign2 = (Button) findViewById(R.id.b_assign_2);
        buttonAssign2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, Tugas2MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonAssign3 = (Button) findViewById(R.id.b_assign_3);
        buttonAssign3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, Tugas3MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonAssign4 = (Button) findViewById(R.id.b_assign_4);
        buttonAssign4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, Tugas4MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonAssign5 = (Button) findViewById(R.id.b_assign_5);
        buttonAssign5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, Tugas5MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonAssign6 = (Button) findViewById(R.id.b_assign_6);
        buttonAssign6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, Tugas6MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonAssign7 = (Button) findViewById(R.id.b_assign_7);
        buttonAssign7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, Tugas7MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonAssign8 = (Button) findViewById(R.id.b_assign_8);
        buttonAssign8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(MainActivity.this, Tugas8MainActivity.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}