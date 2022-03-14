package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    List<Produit> produits ;
    private static ProduitService instance;
    private ProduitService(){
        this.produits=new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : produits) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }
    public String getDesc(int id){
        for(Produit p : produits) {
            if (p.getId() == id)
                return p.getDescription();
        }
        return null;
    }
        public String getIng(int id){
        for(Produit p : produits) {
            if (p.getId() == id)
                return p.getDetaisIngre();
        }
        return null;
    }
    @Override
    public List findAll() {
        return produits;
    }
    public synchronized static ProduitService getInstance() {
        if(instance == null)
            instance = new ProduitService();
        return instance;
    }
}
