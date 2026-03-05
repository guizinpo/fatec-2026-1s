package edu.curso;

public class Animal {

    double peso;
    double altura;

    public Animal(double p, double a) {
        super();
        this.peso = p;
        this.altura = a;
        System.out.println("Animal criado com peso e altura especificados");
    }

    public Animal() { 
        super();
        System.out.println("Animal criado com peso e altura zerados");
    }

    // public Animal() { 
    //     super();
    // }

    public void dormir() {
        System.out.println("Animal dormindo...");
    }

    public void comer() {
        System.out.println("Animal comendo...");
    }
    
}
