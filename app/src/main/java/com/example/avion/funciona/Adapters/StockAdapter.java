package com.example.avion.funciona.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.avion.funciona.Entities.Item;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public abstract class StockAdapter extends RecyclerView.Adapter<StockAdapter.StockViewHolder> {

    ArrayList<Item> stock_list;

    public StockAdapter(ArrayList<Item> stock_list) {
        this.stock_list = stock_list;
    }

    @NonNull
    @Override
    public StockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stock_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_stock,parent,false);
        return new StockViewHolder(stock_view);
    }

    @Override
    public void onBindViewHolder(@NonNull StockViewHolder holder, final int position) {
        holder.txt_code.setText(stock_list.get(position).getItem_code());
        holder.txt_name.setText(stock_list.get(position).getItem_name());
        holder.txt_qty.setText(stock_list.get(position).getItem_quntity());
        holder.txt_price.setText(stock_list.get(position).getItem_price());
        holder.txt_cost.setText(stock_list.get(position).getItem_cost());
        holder.img_stock.setImageResource(stock_list.get(position).getItem_image());

        holder.btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnVerClick(view,position);
                stock_list.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position,stock_list.size());
            }
        });

    }

    @Override
    public int getItemCount() {
        return stock_list.size();
    }

    public abstract void OnVerClick(View v, int pos);

    class StockViewHolder extends RecyclerView.ViewHolder {
        TextView txt_code;
        TextView txt_name;
        TextView txt_qty;
        TextView txt_price;
        TextView txt_cost;
        ImageView img_stock;
        Button btn_e;


        public StockViewHolder (View itemView) {
            super(itemView);

            txt_code =  itemView.findViewById(R.id.item_code);
            txt_name = itemView.findViewById(R.id.item_name);
            txt_qty = itemView.findViewById(R.id.quantity);
            txt_price =  itemView.findViewById(R.id.price);
            txt_cost =  itemView.findViewById(R.id.cost);
            img_stock =  itemView.findViewById(R.id.stock_image);
            btn_e = itemView.findViewById(R.id.btn_eliminar);

        }
    }
}
