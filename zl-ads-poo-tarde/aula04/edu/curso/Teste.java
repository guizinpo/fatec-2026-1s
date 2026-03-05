package edu.curso;

public class Teste {

    public static void testePessoa() {
        System.out.println("Teste de construtores");

        Pessoa p1 = new Pessoa("Joao Silva", 20);
        // p1.iniciar("Joao Silva", 20);
        // System.out.println("Pessoa 1: " + p1.nome + " - " + p1.idade);
        System.out.println("Pessoa 1: " + p1 );
        Pessoa p2 = new Pessoa();
        // System.out.println("Pessoa 2: " + p2.nome + " - " + p2.idade);
        System.out.println("Pessoa 2: " + p2 );
    }

    public static void cadeiaConstrutores() { 
        // Animal a1 = new Animal();
        Pessoa p1 = new Pessoa();

        // Pessoa p2 = new Pessoa("Joao Silva", 20);
    }

    public static void main(String[] args) { 
        cadeiaConstrutores();
    }
    
}
