package com.example.pizzarecipes.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) { return produits.get(i).getId();
    }

    @Override
    public View getView(int position, View  convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null);

        TextView id = convertView.findViewById(R.id.idP);
        TextView nom = convertView.findViewById(R.id.name);
        TextView duree = convertView.findViewById(R.id.duree);
        ImageView image1 = convertView.findViewById(R.id.image);
        ImageView image2 = convertView.findViewById(R.id.clock);
        ImageView info = convertView.findViewById(R.id.desc);



        id.setText(produits.get(position).getId()+"");
        nom.setText(produits.get(position).getNom());
        duree.setText(produits.get(position).getDuree());
        image1.setImageResource(produits.get(position).getPhoto());
        image2.setImageResource(produits.get(position).getPhoto2());
        info.setImageResource(produits.get(position).getPhoto3());

        return convertView;
    }
}
