package com.example.slicecutter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_type_activity);

        ImageButton backButton = findViewById(R.id.back_button_5);
        backButton.setOnClickListener(v -> {
            finish();
        });
        ImageButton cubeButton = findViewById(R.id.choose_3_points);
        cubeButton.setOnClickListener(v -> {
            Toast.makeText(this, "3 points selected", Toast.LENGTH_SHORT).show();
        });
        ImageButton nextButton = findViewById(R.id.okay_button);
        nextButton.setOnClickListener(v -> {
            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
        });
    }
}
