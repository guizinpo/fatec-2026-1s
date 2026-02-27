package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class Televisao {
    String marca;
    int polegadas;
    boolean isSmart;
    int volume;
    int canalAtual;
 
    
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }
 
    public void mudarCanal(int novoCanal, List<String> listaCanais) {
        canalAtual = novoCanal;
        System.out.println("Canal alterado para o número: " + canalAtual);
        novoCanal = 21;
        System.out.println("Novo Canal agora é :" + novoCanal);

        listaCanais.add("Canal 21");
    }
 
    public void acessarApp() {
        if (isSmart) {
            System.out.println("Abrindo o aplicativo...");
        } else {
            System.out.println("Esta TV não possui acesso à internet.");
        }
    }

    public static void main(String[] args) {
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();

        List<String> canais = new ArrayList<>();
        canais.add("TV Cultura");
        canais.add("TV Globo");

        System.out.println("Lista de canais");
        System.out.println(canais);

        int cultura = 2;
        int globo = 5;
        tv1.mudarCanal(cultura, canais);
        System.out.println("Lista de canais: " + canais);
        tv2.mudarCanal(globo, canais);
        System.out.println("Lista de canais: " + canais);

        System.out.println("Canal da cultura é o numero: " + cultura);
        System.out.println("Canal da globo é o numero: " + globo);

        System.out.println("Canal da TV1: " + tv1.canalAtual);
        System.out.println("Canal da TV2: " + tv2.canalAtual);
    }
}
