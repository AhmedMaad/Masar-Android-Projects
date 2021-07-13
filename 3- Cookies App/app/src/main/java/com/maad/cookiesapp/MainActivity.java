package com.maad.cookiesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isFirstPictureVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeDesign(View view) {

        TextView text = findViewById(R.id.tv);
        ImageView image = findViewById(R.id.iv);
        Button button = findViewById(R.id.btn);

        if (isFirstPictureVisible) {
            Toast.makeText(this, "Yummy!", Toast.LENGTH_SHORT).show();
            text.setText("I'm Full");
            image.setImageResource(R.drawable.after_cookie);
            button.setText("Dinner is not ready");
            isFirstPictureVisible = false;
        }
        else {
            text.setText("I'm Hungry");
            image.setImageResource(R.drawable.before_cookie);
            button.setText("Dinner is ready");
            isFirstPictureVisible = true;
        }

    }

}