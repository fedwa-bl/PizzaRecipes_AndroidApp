package com.example.pizzarecipes.classes;

public class Produit {
    private int id;
    private static int c=0;
    private String nom;
    private String description;
    private String preparation;
    private int nbrIngredients;
    private int photo;
    private int photo2;
    private int photo3;
    private String duree;
    private String detaisIngre;

    public int getPhoto2() {
        return photo2;
    }

    public void setPhoto2(int photo2) {
        this.photo2 = photo2;
    }

    public int getPhoto3() {
        return photo3;
    }

    public void setPhoto3(int photo3) {
        this.photo3 = photo3;
    }

    public Produit() {
    }

    public Produit(String nom, int nbrIngredients, int photo, int photo2, int photo3, String duree, String detaisIngre, String description, String preparation  ) {
        this.id = ++c;
        this.nom = nom;
        this.description = description;
        this.preparation = preparation;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.duree = duree;
        this.detaisIngre = detaisIngre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetaisIngre() {
        return detaisIngre;
    }

    public void setDetaisIngre(String detaisIngre) {
        this.detaisIngre = detaisIngre;
    }
}
