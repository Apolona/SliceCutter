package com.example.slicecutter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseFigureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_figure_activity);

        ImageButton backButton = findViewById(R.id.back_button_4);
        backButton.setOnClickListener(v -> {
            finish();
        });
        ImageButton cubeButton = findViewById(R.id.choose_cube);
        cubeButton.setOnClickListener(v -> {
            Toast.makeText(this, "Cube selected", Toast.LENGTH_SHORT).show();
        });
        ImageButton nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(v -> {
            Toast.makeText(this, "NEXT", Toast.LENGTH_SHORT).show();
            /*Intent myIntent = new Intent(this, ChooseTypeActivity.class);
            startActivity(myIntent);*/
        });
    }
}
