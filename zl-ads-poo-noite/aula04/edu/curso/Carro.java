package edu.curso;

public class Carro{ 
    String marca;
    String modelo;

    public Carro() {
        this("Fiat", "Mobi");
        System.out.println("Carro criado: " + marca + " " + modelo + " padronizados");
    }

    public Carro(String marca, String modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Carro criado: " + marca + " " + modelo + " personalizados");
    }

}