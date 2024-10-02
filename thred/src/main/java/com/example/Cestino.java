package com.example;

public class Cestino {
    private int contatore;
    public Cestino(int i){
        contatore = i;
    }

    synchronized public void aggiungiMoneta(){
        contatore = contatore + 1;
    }

    public int getContatore() {
        return contatore;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }



    
}
