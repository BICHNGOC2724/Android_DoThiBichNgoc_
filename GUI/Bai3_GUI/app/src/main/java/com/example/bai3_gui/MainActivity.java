package com.example.bai3_gui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editName = findViewById(R.id.editName);
        EditText editHeight = findViewById(R.id.editHeight);
        EditText editWeight = findViewById(R.id.editWeight);
        EditText editBmi = findViewById(R.id.editBmi);
        EditText editDiagnosis = findViewById(R.id.editDiagnosis);
        Button btnCalculateBMI = findViewById(R.id.btnCalculateBMI);

        btnCalculateBMI.setOnClickListener(v -> {
            String name = editName.getText().toString();
            double height = Double.parseDouble(editHeight.getText().toString());
            double weight = Double.parseDouble(editWeight.getText().toString());

            // Tính BMI
            double bmi = weight / (height * height);
            editBmi.setText(String.format("%.2f", bmi));

            // Phân loại BMI
            String diagnosis;
            if (bmi < 18) {
                diagnosis = "Người gầy";
            } else if (bmi >= 18 && bmi < 25) {
                diagnosis = "Người bình thường";
            } else if (bmi >= 25 && bmi < 30) {
                diagnosis = "Béo phì độ I";
            } else if (bmi >= 30 && bmi < 35) {
                diagnosis = "Béo phì độ II";
            } else {
                diagnosis = "Béo phì độ III";
            }
            editDiagnosis.setText(diagnosis);
        });
    }
}

