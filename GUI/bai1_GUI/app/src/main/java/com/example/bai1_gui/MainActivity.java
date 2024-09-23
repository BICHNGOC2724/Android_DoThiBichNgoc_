package com.example.bai1_gui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNumberA = findViewById(R.id.editNumberA);
        EditText editNumberB = findViewById(R.id.editNumberB);
        TextView resultText = findViewById(R.id.resultText);

        Button btnSum = findViewById(R.id.btnSum);
        Button btnSubtract = findViewById(R.id.btnSubtract);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnGCD = findViewById(R.id.btnGCD);
        Button btnExit = findViewById(R.id.btnExit);

        btnSum.setOnClickListener(v -> {
            int a = Integer.parseInt(editNumberA.getText().toString());
            int b = Integer.parseInt(editNumberB.getText().toString());
            resultText.setText("Tổng: " + (a + b));
        });

        btnSubtract.setOnClickListener(v -> {
            int a = Integer.parseInt(editNumberA.getText().toString());
            int b = Integer.parseInt(editNumberB.getText().toString());
            resultText.setText("Hiệu: " + (a - b));
        });

        btnMultiply.setOnClickListener(v -> {
            int a = Integer.parseInt(editNumberA.getText().toString());
            int b = Integer.parseInt(editNumberB.getText().toString());
            resultText.setText("Tích: " + (a * b));
        });

        btnDivide.setOnClickListener(v -> {
            int a = Integer.parseInt(editNumberA.getText().toString());
            int b = Integer.parseInt(editNumberB.getText().toString());
            if (b != 0) {
                resultText.setText("Thương: " + (a / (double) b));
            } else {
                resultText.setText("Không thể chia cho 0");
            }
        });

        btnGCD.setOnClickListener(v -> {
            int a = Integer.parseInt(editNumberA.getText().toString());
            int b = Integer.parseInt(editNumberB.getText().toString());
            resultText.setText("ƯCLN: " + gcd(a, b));
        });

        btnExit.setOnClickListener(v -> finish());
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
