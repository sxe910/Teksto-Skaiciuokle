package com.example.tekstoskaiciuokle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    EditText editTextInput;
    Spinner spinnerMetric;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextInput = findViewById(R.id.editTextInput);
        spinnerMetric = findViewById(R.id.spinnerMetric);
        textViewResult = findViewById(R.id.textView);
        Button buttonCount = findViewById(R.id.buttonCount);

        buttonCount.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });



    }
    private void calculate(){
        String text = editTextInput.getText().toString();

        if (text.trim().isEmpty()) {
            Toast.makeText(this, R.string.errorEmpty, Toast.LENGTH_SHORT).show();
        }



    }
}