package edu.curso;

public class Violino {
    public String marca;
    public String modelo;
    public String cor;
    public int anoMontagem;
    public float preco;
    public float tensaoCordaLa;
 
    public void tocarCordaMi(){
        System.out.println("Tocando corda Mi");
    }
    public void tocarCordaLa(){
        if (tensaoCordaLa < 0.4) { 
            System.out.println("Tocando corda Sol");    
        } else if( tensaoCordaLa  > 0.6) { 
            System.out.println("Tocando corda Si");
        } else {
            System.out.println("Tocando corda La");
        }
    } 
    public void tocarCordaRe(){
        System.out.println("Tocando corda Re");
    }
    public void tocarCordaSol(){
        System.out.println("Tocando corda Sol");
    } 

    public static void main(String[] args) {
        Violino v1 = new Violino();
        v1.tensaoCordaLa = 0.5f;
        v1.tocarCordaLa();
    }
}
