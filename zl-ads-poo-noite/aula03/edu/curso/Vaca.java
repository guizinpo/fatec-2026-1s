package edu.curso;

public class Vaca {
    String pelagem;
    float peso;
    float altura;
    String corDosOlhos;
    float largura;

    public void corre(){
        System.out.println("🐄🐄🐄🐄🐄");
        peso += 10.0f;
    }

    public void muge(){
        System.out.println("MUUUUUUU");
    }

    public void comeMato(){
        System.out.println("🐄🥬🥬🥬");
        peso += 10.0f;
    }

    public int ordenhar() {
        int leite = 10;
        System.out.println("Vaca com :" + peso + " kilos");
        if (peso > 400) { 
            double litrosLeite = peso *0.05;
            System.out.println("Foram ordenhados " + litrosLeite + " litros de leite");
            return (int)litrosLeite;
        } else { 
            System.out.println("Esta vaca esta muito magra para ser ordenhada");
        }
        return 0;
    }

    public static void main(String[] args) {
        Vaca v1 = new Vaca();
        v1.altura = 1.60f;
        v1.largura = 2.5f;
        v1.peso = 350.0f;
        v1.pelagem = "Holandesa";
        v1.corDosOlhos = "pretos";
        
        v1.ordenhar();
        v1.comeMato();
        v1.comeMato();
        v1.comeMato();
        v1.comeMato();
        v1.comeMato();
        v1.comeMato();
        v1.ordenhar();
    }
}
