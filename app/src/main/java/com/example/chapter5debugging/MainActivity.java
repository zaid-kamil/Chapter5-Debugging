package com.example.chapter5debugging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editA;
    private EditText editB;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMul = findViewById(R.id.btnMultiply);
        Button btnDiv = findViewById(R.id.btnDivide);
        editA = findViewById(R.id.editA);
        editB = findViewById(R.id.editB);
        textResult = findViewById(R.id.textResult);

        // event for clicking
        btnAdd.setOnClickListener(v -> {
            compute("+");
        });
        btnMul.setOnClickListener(v -> {
            compute("*");
        });
        btnSub.setOnClickListener(v -> {
            compute("-");
        });
        btnDiv.setOnClickListener(v -> {
            compute("/");
        });
    }

    public void compute(String action) {
        int a = Integer.parseInt(editA.getText().toString());
        int b = Integer.parseInt(editB.getText().toString());
        int out = 0; // default value
        switch (action) {
            case "+":
                out = a + b;
                break;
            case "-":
                out = a - b;
                break;
            case "*":
                out = a * b;
                break;
            case "/":
                out = a / b;
                break;
        }
        textResult.setText(String.valueOf(out));
    }
}