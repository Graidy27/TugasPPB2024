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

public class Tugas2MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tugas2_main);

        //get id
        EditText editPanjang  = (EditText) findViewById(R.id.tugas2ETPanjang);
        EditText editLebar  = (EditText) findViewById(R.id.tugas2ETLebar);

        TextView textLuas = (TextView) findViewById(R.id.tugas2Luas);

        Button button = (Button) findViewById(R.id.hitungLuas);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = editPanjang.getText().toString().trim();
                String lebar = editLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;


                // Start the new activity
                textLuas.setText("Luas : " + luas);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}