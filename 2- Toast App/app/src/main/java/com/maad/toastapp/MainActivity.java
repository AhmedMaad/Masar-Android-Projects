package com.maad.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        EditText editText = findViewById(R.id.et);
        String writtenText = editText.getText().toString();
        if (writtenText.isEmpty()) {
            Toast.makeText(this, "You should write anything", Toast.LENGTH_SHORT).show();
            editText.setError("Required Field");
        }
        else
            Toast.makeText(this, "Hello " + writtenText, Toast.LENGTH_SHORT).show();
    }

}