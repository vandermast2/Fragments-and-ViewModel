package com.example.fragmentsandviewmodel.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentsandviewmodel.R;
import com.example.fragmentsandviewmodel.models.Reciepe;

import java.util.ArrayList;
import java.util.List;

public class ReciepeAdapter extends RecyclerView.Adapter<ReciepeViewHolder> {
    private List<Reciepe> reciepes;

    public ReciepeAdapter(List reciepes) {
        this.reciepes = reciepes;
    }

    @NonNull
    @Override
    public ReciepeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.receipe_layout,parent,false);
        return new ReciepeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReciepeViewHolder holder, int position) {
        holder.onBind(reciepes.get(position));
    }

    @Override
    public int getItemCount() {
        return reciepes.size();
    }
}
