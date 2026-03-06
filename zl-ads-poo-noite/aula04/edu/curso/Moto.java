package edu.curso;

public class Moto {
    Pneu p1;
    Pneu p2;
    int velocidade = 0;

    public Moto() { 
        p1 = new Pneu(17);
        p2 = new Pneu(17);
        System.out.println("A moto foi produzida...");
    }

    public void acelerar() { 
        this.velocidade += 10;
        System.out.println("A moto está acelerando para " + this.velocidade + " km/h");
        this.p1.rodar();
        this.p2.rodar();
    }
}
