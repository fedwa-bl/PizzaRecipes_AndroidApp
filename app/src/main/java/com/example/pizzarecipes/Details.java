package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.adapter.PizzaAdapter;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

import java.util.ArrayList;

public class Details extends AppCompatActivity {
    ProduitService ps;
    TextView desc,ingr,id,nom;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ps=ProduitService.getInstance();
        setContentView(R.layout.activity_details);
        desc=findViewById(R.id.descr);
        ingr=findViewById(R.id.ingr);
        id=findViewById(R.id.idP);
        nom=findViewById(R.id.nom);
        image=findViewById(R.id.img);
       Intent intent = getIntent();
       String idP =intent.getStringExtra("key");
       int id=Integer.parseInt(idP);
       Produit p=ps.findById(id);
       nom.setText(p.getNom());
       desc.setText(p.getDescription());
       ingr.setText(p.getDetaisIngre());
       image.setImageResource(p.getPhoto());


    }
}