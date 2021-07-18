package com.maad.afragmentstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Showing Chapter one by default at application launch
        ChapterOneFragment fragment = new ChapterOneFragment();
        replaceFragment(fragment);
    }

    public void openChapterOne(View view) {
        ChapterOneFragment fragment = new ChapterOneFragment();
        replaceFragment(fragment);
    }

    public void openChapterTwo(View view) {
        ChapterTwoFragment fragment = new ChapterTwoFragment();
        replaceFragment(fragment);
    }

    public void openChapterThree(View view) {
        ChapterThreeFragment fragment = new ChapterThreeFragment();
        replaceFragment(fragment);
    }

    public void openChapterFour(View view) {
        ChapterFourFragment fragment = new ChapterFourFragment();
        replaceFragment(fragment);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }

}