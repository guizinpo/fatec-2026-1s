package edu.curso;

public class Mochila {
    static final int CAPACIDADE_ITENS = 20;
    int bolsos;
    String cor;
    double pesoMax;
    String marca;
    String[] itens = new String[CAPACIDADE_ITENS];
    int quantidadeAtual;
    int indiceItem = 0;

    public void adicionarItem( String item ) { 
        if (indiceItem < CAPACIDADE_ITENS) { 
            itens[indiceItem++] = item;
        } else { 
            System.out.println("Não cabe mais iten na mochila");
        }
    }
}
