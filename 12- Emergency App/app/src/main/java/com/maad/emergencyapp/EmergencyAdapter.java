package com.maad.emergencyapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class EmergencyAdapter extends RecyclerView.Adapter<EmergencyAdapter.EmergencyViewHolder> {

    private Activity activity;
    private ArrayList<EmergencyModel> emergencies;

    public EmergencyAdapter(Activity activity, ArrayList<EmergencyModel> emergencies) {
        this.activity = activity;
        this.emergencies = emergencies;
    }

    @NonNull
    @Override
    public EmergencyAdapter.EmergencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.list_item, parent, false);
        EmergencyViewHolder viewHolder = new EmergencyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EmergencyAdapter.EmergencyViewHolder holder, int position) {
        holder.textView.setText(emergencies.get(position).getName());
        holder.imageView.setImageResource(emergencies.get(position).getPicture());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:" + emergencies.get(position).getPhoneNumber());
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                activity.startActivity(callIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return emergencies.size();
    }

    public class EmergencyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;
        private CardView cardView;

        public EmergencyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);
            imageView = itemView.findViewById(R.id.iv);
            cardView = itemView.findViewById(R.id.parent);
        }
    }
}
