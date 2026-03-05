package edu.curso;

public class Moto {
    Pneu p1;
    Pneu p2;

    public Moto() { 
        p1 = new Pneu(16);
        p2 = new Pneu(16);
    }

    public static void main(String[] args) {
        Moto moto = new Moto();
    }
}
