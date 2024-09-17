package com.example.btb2_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgDice;
    private Button btnRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDice = findViewById(R.id.imgDice);
        btnRoll = findViewById(R.id.btnRoll);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int diceRoll = random.nextInt(6) + 1; // Sinh số ngẫu nhiên từ 1-6

                // Cập nhật hình ảnh của xúc xắc dựa trên số ngẫu nhiên
                switch(diceRoll) {
                    case 1:
                        imgDice.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        imgDice.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        imgDice.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        imgDice.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        imgDice.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        imgDice.setImageResource(R.drawable.dice_6);
                        break;
                }
            }
        });
    }
}

