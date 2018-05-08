package com.example.avion.funciona.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Entities.Expenses;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class ExpensesAdapter extends RecyclerView.Adapter<ExpensesViewHolder> {
    ArrayList<Expenses> expenses_list;

    public ExpensesAdapter(ArrayList<Expenses> expenses_list){this.expenses_list= expenses_list;}

    @NonNull
    @Override
    public ExpensesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View expenses_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_expenses, parent, false);
        return new ExpensesViewHolder(expenses_view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExpensesViewHolder holder, int position ){
        holder.account_nameEx.setText(expenses_list.get(position).getName());
        holder.textViewProduct1.setText(expenses_list.get(position).getProduct());
        holder.textViewProduct2.setText(expenses_list.get(position).getProduct());
        holder.textViewProduct3.setText(expenses_list.get(position).getProduct());
        holder.textViewQuantity1.setText(expenses_list.get(position).getQuantity());
        holder.textViewQuantity2.setText(expenses_list.get(position).getQuantity());
        holder.textViewQuantity3.setText(expenses_list.get(position).getQuantity());
        holder.textViewPrice1.setText(expenses_list.get(position).getPrice());
        holder.textViewPrice2.setText(expenses_list.get(position).getPrice());
        holder.textViewPrice3.setText(expenses_list.get(position).getPrice());
        holder.textViewSubtotal1.setText(expenses_list.get(position).getSubtotal());
        holder.textViewSubtotal2.setText(expenses_list.get(position).getSubtotal());
        holder.textViewSubtotal3.setText(expenses_list.get(position).getSubtotal());
    }

    @Override
    public int getItemCount(){return expenses_list.size();}
}
