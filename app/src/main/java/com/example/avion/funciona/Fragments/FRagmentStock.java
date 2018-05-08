package com.example.avion.funciona.Fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.avion.funciona.Adapters.StockAdapter;
import com.example.avion.funciona.Entities.Item;
import com.example.avion.funciona.R;
import java.util.ArrayList;


public class FRagmentStock extends Fragment {
    //------------------variables--------------
    RecyclerView recicler;
    ArrayList<Item> item_list = new ArrayList<Item>();
    EditText addName ;
    EditText addQty;
    EditText addPrice;
    EditText addCost;
    Button buttonCancel;
    Button buttonAdd;
    ImageView addImg;
    Fragment fragment = this;
    private final int SELECT_PICTURE = 1234;


    //------------------variables--------------
    public FRagmentStock() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_stock, container, false);//original
        View view = inflater.inflate(R.layout.fragment_stock, container,false);
        //=============declarando arrays de cardview===================

        recicler = (RecyclerView) view.findViewById(R.id.recycler_stock);
        recicler.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();
        StockAdapter stockAdapter = new StockAdapter(item_list);
        recicler.setAdapter(stockAdapter);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(getContext());
                View mView = getLayoutInflater().inflate(R.layout.add_item_alert, null);
                addName = (EditText) mView.findViewById(R.id.addName);
                addQty = (EditText) mView.findViewById(R.id.addQty);
                addPrice = (EditText) mView.findViewById(R.id.addPrice);
                addCost = (EditText) mView.findViewById(R.id.addCost);
                buttonCancel = (Button) mView.findViewById(R.id.buttonCancel);
                buttonAdd = (Button) mView.findViewById(R.id.buttonAdd);
                addImg = (ImageView) mView.findViewById(R.id.img_inventario) ;


                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();


                buttonCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

                buttonAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!addName.getText().toString().isEmpty() && !addQty.getText().toString().isEmpty()
                                && !addPrice.getText().toString().isEmpty() && !addCost.getText().toString().isEmpty()){


                            Toast.makeText(getContext(), "Item added to stock", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                        else {
                            Toast.makeText(getContext(), "Do not leave any empty field", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
             addImg.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     cargarImagen();
                 }
             });
            }
        });


        return view;
    }

    public void llenarLista(){
        item_list.add(new Item("I0001", "Chikorita", "1", "$99.99", "$50.00", R.drawable.chikorita));
        item_list.add(new Item("I0002", "ONI", "3", "$14.50","$7.75", R.drawable.oni));
        item_list.add(new Item("I0003", "Mastur Ch33f", "10", "$0.99", "$0.25", R.drawable.uni));
        item_list.add(new Item("I0001", "Chikorita", "1", "$99.99", "50.00", R.drawable.chikorita));
        item_list.add(new Item("I0002", "ONI", "3", "$14.50","$7.75", R.drawable.oni));
        item_list.add(new Item("I0003", "Mastur Ch33f", "10", "$0.99", "$0.25", R.drawable.uni));
        item_list.add(new Item("I0004", "prueba", "10","5.00", "2.00", R.drawable.mint));
    }



    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    //-===================imagen===========================================================
    ImageView ima_inventa;




    public void cargarImagen() {

        Intent i  = new  Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        i.setType("image/");
        fragment.startActivityForResult(i.createChooser(i,"Open with"), SELECT_PICTURE);

    }




    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (resultCode== getActivity().RESULT_OK){
            Uri path = data.getData();
            addImg.setImageURI(path);
        }
    }

}
