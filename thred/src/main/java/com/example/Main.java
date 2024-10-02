package com.example;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Cestino c = new Cestino(0);
        Versamento v1 = new Versamento(c, 3500);
        Versamento v2 = new Versamento(c, 3500);
        v1.start();
        v2.start();
        v1.join();
        v2.join();
        System.out.println(c.getContatore());
    }
}