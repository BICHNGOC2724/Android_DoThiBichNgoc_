package com.example.bai2_gui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editFahrenheit = findViewById(R.id.editFahrenheit);
        EditText editCelsius = findViewById(R.id.editCelsius);
        Button btnConvertToCelsius = findViewById(R.id.btnConvertToCelsius);
        Button btnConvertToFahrenheit = findViewById(R.id.btnConvertToFahrenheit);
        Button btnClear = findViewById(R.id.btnClear);

        // Chuyển từ Fahrenheit sang Celsius
        btnConvertToCelsius.setOnClickListener(v -> {
            String fahrenheitText = editFahrenheit.getText().toString();
            if (!fahrenheitText.isEmpty()) {
                double fahrenheit = Double.parseDouble(fahrenheitText);
                double celsius = (fahrenheit - 32) * 5 / 9;
                editCelsius.setText(String.format("%.2f", celsius));
            }
        });

        // Chuyển từ Celsius sang Fahrenheit
        btnConvertToFahrenheit.setOnClickListener(v -> {
            String celsiusText = editCelsius.getText().toString();
            if (!celsiusText.isEmpty()) {
                double celsius = Double.parseDouble(celsiusText);
                double fahrenheit = celsius * 9 / 5 + 32;
                editFahrenheit.setText(String.format("%.2f", fahrenheit));
            }
        });

        // Xóa dữ liệu trong EditText
        btnClear.setOnClickListener(v -> {
            editFahrenheit.setText("");
            editCelsius.setText("");
        });
    }
}
