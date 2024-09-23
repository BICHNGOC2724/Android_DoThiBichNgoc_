package com.example.b1lab2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout; // Sử dụng FrameLayout
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final int[] colors = {
            Color.parseColor("#FF5733"),
            Color.parseColor("#33FF57"),
            Color.parseColor("#3357FF")
    };

    private final int[] icons = {
            R.drawable.dog,
            R.drawable.turtle,
            R.drawable.penguin
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy FrameLayout thay vì LinearLayout
        FrameLayout layout = findViewById(R.id.main);

        // Tạo Random để chọn màu và icon ngẫu nhiên
        Random random = new Random();
        int randomColor = colors[random.nextInt(colors.length)];
        int randomIcon = icons[random.nextInt(icons.length)];

        // Thay đổi màu nền
        layout.setBackgroundColor(randomColor);

        // Cập nhật ImageView với biểu tượng ngẫu nhiên
        ImageView imageView = findViewById(R.id.icon);
        imageView.setImageResource(randomIcon);
    }
}
