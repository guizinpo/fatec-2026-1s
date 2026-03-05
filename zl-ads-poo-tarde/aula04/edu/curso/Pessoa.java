package edu.curso;
public class Pessoa extends Animal{ 
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        super(70, 1.70);
        this.nome = nome;
        this.idade = idade;
        System.out.println("Pessoa criada com nome e idade especificados");
    }

    public Pessoa() {
        this("Anonymous", 0);
        // this.nome = ;
        // this.idade = 0;
        System.out.println("Pessoa criada com nome e idade padrao");
    }

    public String toString() { 
        // return super.toString();
        return String.format("Nome: %s   Idade: %d", this.nome, this.idade);
    }

    // public void iniciar( String nome, int idade) {
    //     this.nome = nome;
    //     this.idade = idade;
    // }
}