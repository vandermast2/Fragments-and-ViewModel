package com.example.fragmentsandviewmodel.ui.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentsandviewmodel.R;
import com.example.fragmentsandviewmodel.models.Reciepe;

public class ReciepeViewHolder extends RecyclerView.ViewHolder {
    private TextView txtTitle;
    private TextView txtMsg;

    public ReciepeViewHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtMsg = itemView.findViewById(R.id.txtMsg);
    }

    public void onBind(Reciepe reciepe){
        txtTitle.setText(reciepe.getTitle());
        txtMsg.setText(reciepe.getMsg());
    }
}
