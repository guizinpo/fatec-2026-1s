package edu.curso;

public class Pneu {
    int aro;
    public Pneu(int aro) { 
        this.aro = aro;
        System.out.println("Pneu com aro " + aro + " está sendo criado...");
    }

    public void rodar() { 
        System.out.println("O pneu de aro " + aro + " está rodando...");
    }
}
