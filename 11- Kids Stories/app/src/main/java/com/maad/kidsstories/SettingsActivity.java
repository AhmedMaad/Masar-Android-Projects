package com.maad.kidsstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Settings");

        RadioGroup rg = findViewById(R.id.rg);

        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
        int savedSize = preferences.getInt("size", 20);

        switch (savedSize) {

            case 16:
                rg.check(R.id.rb_small);
                break;

            case 20:
                rg.check(R.id.rb_default);
                break;

            case 24:
                rg.check(R.id.rb_large);
                break;

        }

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {

                    case R.id.rb_small:
                        saveTextSize(16);
                        break;

                    case R.id.rb_default:
                        saveTextSize(20);
                        break;

                    case R.id.rb_large:
                        saveTextSize(24);
                        break;

                }
            }
        });

    }

    private void saveTextSize(int size) {
        SharedPreferences.Editor editor =
                getSharedPreferences("settings", MODE_PRIVATE).edit();
        editor.putInt("size", size);
        editor.apply();
        Toast.makeText(this, "Text Size Changed Successfully", Toast.LENGTH_SHORT).show();
    }

}