package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);

                EditText editText = findViewById(R.id.editTextMessage);
                String message = editText.getText().toString();

                intent.putExtra(Intent.EXTRA_TEXT, message);
                intent.setType("text/plain");
                Intent intent2 = Intent.createChooser(intent, null);
                startActivity(intent2);
            }
        });

        //Toast.makeText(SecondActivity.this, getIntent().getStringExtra("variable"), Toast.LENGTH_SHORT).show();
    }
}