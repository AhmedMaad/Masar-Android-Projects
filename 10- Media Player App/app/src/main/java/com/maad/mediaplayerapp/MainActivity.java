package com.maad.mediaplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSound(View view) {
        if (media == null)
            media = MediaPlayer.create(this, R.raw.sound);
        media.start();
    }

    public void pauseSound(View view) {
        if (media != null)
            media.pause();
    }

    public void stopSound(View view) {
        if (media != null) {
            media.stop();
            media = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        media.release();
    }

}