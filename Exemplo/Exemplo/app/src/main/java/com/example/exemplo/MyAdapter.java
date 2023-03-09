package com.example.exemplo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    Context context;
    List<Produto> produtos;
    private OnItemClickListener mListener;

    public MyAdapter(Context context, List<Produto> produtos) {
        this.context = context;
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(produtos.get(position).getNome());
        holder.descriptionView.setText(produtos.get(position).getDescricao());
        holder.quantityView.setText(produtos.get(position).getQuantidade());
        holder.imageView.setImageDrawable(produtos.get(position).getImagem());

//        holder.layout.setOnClickListener((View view) -> {
//            if (mListener != null) {
//                mListener.onItemClick(position);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

//    public void setOnItemClickListener(OnItemClickListener listener) {
//        mListener = listener;
//    }
}
