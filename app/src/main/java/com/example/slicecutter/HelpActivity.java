package com.example.slicecutter;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity);

        Button backButton = findViewById(R.id.back_button_3);
        backButton.setOnClickListener(v -> {
            finish();
        });
    }
}
