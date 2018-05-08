package com.example.avion.funciona.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Entities.Incomes;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class IncomesAdapter extends RecyclerView.Adapter<IncomesViewHolder> {
    ArrayList<Incomes> incomes_list;

    public IncomesAdapter(ArrayList<Incomes>incomes_list){this.incomes_list= incomes_list;}

    @NonNull
    @Override
    public IncomesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View incomes_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_incomes, parent, false);
        return new IncomesViewHolder(incomes_view);
    }

    @Override
    public void onBindViewHolder(@NonNull IncomesViewHolder holder, int position ){
        holder.account_nameIn.setText(incomes_list.get(position).getName());
        holder.textViewProduct11.setText(incomes_list.get(position).getProduct());
        holder.textViewProduct21.setText(incomes_list.get(position).getProduct());
        holder.textViewProduct31.setText(incomes_list.get(position).getProduct());
        holder.textViewQuantity11.setText(incomes_list.get(position).getQuantity());
        holder.textViewQuantity21.setText(incomes_list.get(position).getQuantity());
        holder.textViewQuantity31.setText(incomes_list.get(position).getQuantity());
        holder.textViewPrice11.setText(incomes_list.get(position).getPrice());
        holder.textViewPrice21.setText(incomes_list.get(position).getPrice());
        holder.textViewPrice31.setText(incomes_list.get(position).getPrice());
        holder.textViewSubtotal11.setText(incomes_list.get(position).getSubtotal());
        holder.textViewSubtotal21.setText(incomes_list.get(position).getSubtotal());
        holder.textViewSubtotal31.setText(incomes_list.get(position).getSubtotal());
    }

    @Override
    public int getItemCount(){return incomes_list.size();}

}
