package edu.curso;

public class Pneu {
    int aro;

    public Pneu(int valor) {
        this.aro = valor;
        String texto = String.format("Pneu com aro: %d esta sendo criado", this.aro);
        System.out.println(texto);
        // System.out.println("Pneu com aro: " + this.aro + " esta sendo criado");
    }

    public void rodar() { 
        System.out.println("Pneu rodando...");
    }
}
