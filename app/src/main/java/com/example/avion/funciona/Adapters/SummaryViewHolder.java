package com.example.avion.funciona.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.avion.funciona.R;

/**
 * Created by luisro on 5/6/18.
 */

public class SummaryViewHolder extends RecyclerView.ViewHolder{

    TextView txt_code;
    TextView txt_name;
    TextView txt_qty;
    TextView txt_price;
    TextView txt_cost;
    ImageView img_stock;


    public SummaryViewHolder(View itemView) {
        super(itemView);

        txt_code = (TextView) itemView.findViewById(R.id.item_code);
        txt_name = (TextView)itemView.findViewById(R.id.item_name);
        txt_qty = (TextView)itemView.findViewById(R.id.quantity);
        txt_price = (TextView) itemView.findViewById(R.id.price);
        txt_cost = (TextView) itemView.findViewById(R.id.cost);
        img_stock = (ImageView) itemView.findViewById(R.id.stock_image);
    }
}
