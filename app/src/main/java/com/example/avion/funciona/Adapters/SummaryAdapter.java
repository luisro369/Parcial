package com.example.avion.funciona.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Entities.Item;
import com.example.avion.funciona.R;

import java.util.ArrayList;

/**
 * Created by luisro on 5/6/18.
 */

public class SummaryAdapter extends RecyclerView.Adapter<SummaryViewHolder> {

    ArrayList<Item> summary_list;

    public SummaryAdapter(ArrayList<Item> summary_list) {
        this.summary_list = summary_list;
    }

    @NonNull
    @Override
    public SummaryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View summary_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_summary,parent,false);
        return new SummaryViewHolder(summary_view);
    }

    @Override
    public void onBindViewHolder(@NonNull SummaryViewHolder holder, int position) {
        holder.txt_code.setText(summary_list.get(position).getItem_code());
        holder.txt_name.setText(summary_list.get(position).getItem_name());
        holder.txt_qty.setText(summary_list.get(position).getItem_quntity());
        holder.txt_price.setText(summary_list.get(position).getItem_price());
        holder.txt_cost.setText(summary_list.get(position).getItem_cost());
        holder.img_stock.setImageResource(summary_list.get(position).getItem_image());

    }

    @Override
    public int getItemCount() {
        return summary_list.size();
    }
}

