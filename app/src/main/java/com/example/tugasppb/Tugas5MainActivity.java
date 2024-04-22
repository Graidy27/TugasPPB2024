package com.example.tugasppb;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tugas5MainActivity extends AppCompatActivity {
    private EditText first_name = null;
    private EditText last_name = null;
    private TextView result = null;


    View.OnClickListener clickListenerActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int viewId = v.getId();
            if (viewId == R.id.buttonShowInputDialog) {
                Tugas5MainActivity.this.tampilInput();
            }
        }
    };

    DialogInterface.OnClickListener dialogListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            //positif -1 negatif -2
            switch (which) {
                case -1:
                    if (Tugas5MainActivity.this.result != null && Tugas5MainActivity.this.first_name != null && Tugas5MainActivity.this.last_name != null) {
                        String name = Tugas5MainActivity.this.first_name.getText().toString() + " " + Tugas5MainActivity.this.last_name.getText().toString();

                        Tugas5MainActivity.this.result.setText(name);
                    }
                    break;
                case -2:
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tugas5_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        this.result = (TextView) findViewById(R.id.result);

        Button buttonShowInputDialog = (Button) findViewById(R.id.buttonShowInputDialog);
        buttonShowInputDialog.setOnClickListener(this.clickListenerActivity);
    }
    private void tampilInput() {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View viewDialog = layoutInflater.inflate(R.layout.tugas5_input_dialog, null);

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setView(viewDialog);

        this.first_name = (EditText) viewDialog.findViewById(R.id.editTextFirstName);
        this.last_name = (EditText) viewDialog.findViewById(R.id.editTextLastName);

        dialog
                .setCancelable(false)
                .setPositiveButton(R.string.ok, this.dialogListener)
                .setNegativeButton(R.string.cancel, this.dialogListener);

        dialog.show();
    }
}