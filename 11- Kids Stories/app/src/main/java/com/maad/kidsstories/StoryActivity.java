package com.maad.kidsstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        String title = getIntent().getStringExtra("title");
        String story = getIntent().getStringExtra("story");
        int sound = getIntent().getIntExtra("sound", 0);
        int picture = getIntent().getIntExtra("picture", 0);

        setTitle(title);

        media = MediaPlayer.create(this, sound);
        media.start();

        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
        int savedSize = preferences.getInt("size", 20);

        TextView text = findViewById(R.id.tv);
        text.setText(story);
        text.setTextSize(savedSize);

        ImageView image = findViewById(R.id.iv);
        image.setImageResource(picture);

    }

    @Override
    protected void onPause() {
        super.onPause();
        media.release();
    }
}