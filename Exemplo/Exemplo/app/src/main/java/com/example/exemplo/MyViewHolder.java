package com.example.exemplo;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView nameView, descriptionView, quantityView;
    RelativeLayout layout;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        descriptionView = itemView.findViewById(R.id.description);
        quantityView = itemView.findViewById(R.id.quantity);
        layout = itemView.findViewById(R.id.layout);
    }

}
