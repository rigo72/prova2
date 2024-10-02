package com.example;

public class Versamento extends Thread{
    private Cestino c;
    private int q;
    public Versamento(Cestino c, int q){
        this.c = c;
        this.q = q;
    }

    public void run(){
        for (int i=0;i<q;i++){
            c.aggiungiMoneta();
        }
    }
}
