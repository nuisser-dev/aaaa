package com.university.Restaurant_management.Entity;

import jakarta.persistence.*;

@Entity
public class Orderr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCommand;

 
    private  String NameCommand;

  
    private int PrixCommand;

    private int FraisLivraison;


    public long getIdCommand() {
        return idCommand;
    }

    public void setIdCommand(long idCommand) {
        this.idCommand = idCommand;
    }

    public String getNameCommand() {
        return NameCommand;
    }

    public void setNameCommand(String nameCommand) {
        NameCommand = nameCommand;
    }

    public int getPrixCommand() {
        return PrixCommand;
    }

    public void setPrixCommand(int prixCommand) {
        PrixCommand = prixCommand;
    }

    public int getFraisLivraison() {
        return FraisLivraison;
    }

    public void setFraisLivraison(int fraisLivraison) {
        FraisLivraison = fraisLivraison;
    }
}
