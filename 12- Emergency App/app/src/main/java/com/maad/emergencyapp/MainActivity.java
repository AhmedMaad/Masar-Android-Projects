package com.maad.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<EmergencyModel> emergencies = new ArrayList<>();
        emergencies.add(new EmergencyModel("Police", R.drawable.ic_police, 122));
        emergencies.add(new EmergencyModel("Ambulance", R.drawable.ic_hospital, 123));
        emergencies.add(new EmergencyModel("Fire Truck", R.drawable.ic_fire, 180));
        emergencies.add(new EmergencyModel("Child Rescue", R.drawable.ic_child, 16000));

        RecyclerView recyclerView = findViewById(R.id.rv);
        EmergencyAdapter adapter = new EmergencyAdapter(this, emergencies);
        recyclerView.setAdapter(adapter);

    }
}