package com.example.avion.funciona.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Entities.Item;
import com.example.avion.funciona.Entities.Summary;
import com.example.avion.funciona.R;

import java.util.ArrayList;


public class SummaryAdapter extends RecyclerView.Adapter<SummaryViewHolder> {

    ArrayList<Summary> summary_list;

    public SummaryAdapter(ArrayList<Summary> summary_list) {
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
        holder.nameSum.setText(summary_list.get(position).getNameSum());
        holder.status.setText(summary_list.get(position).getEstadoStatus());
        holder.incomeSum.setText(summary_list.get(position).getIncomesSum());
        holder.expensesSum.setText(summary_list.get(position).getExpensesSum());
     }

    @Override
    public int getItemCount() {
        return summary_list.size();
    }
}

