package com.example.slicecutter;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us_activity);

        Button backButton = findViewById(R.id.back_button_2);
        backButton.setOnClickListener(v -> {
            finish();
        });
    }
}
