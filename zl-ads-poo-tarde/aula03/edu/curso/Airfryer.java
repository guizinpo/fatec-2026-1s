package edu.curso;

public class Airfryer {
    int capacidadeLitros;
    int temperaturaAtual;
    int tempoProgramado;
    int temperaturaSelecionada;
    boolean ligada;
    boolean alimentoDentro;

    public void aquecer() { 
        if (ligada) {
            System.out.println("Airfryer aquecendo...");
            if (temperaturaAtual < temperaturaSelecionada) {
                temperaturaAtual += 5;
            }
        } else { 
            System.out.println("A airfryer está desligada, é preciso ligá-la primeiro");
        }
    }

    public void ligar() { 
        System.out.println("Airfryer ligada");
        ligada = true;
    }


    public static void main(String[] args) {
        Airfryer a1 = new Airfryer();
        Airfryer a2 = new Airfryer();
        a1.aquecer();
        a1.ligar();
        a1.aquecer();
        a2.aquecer();
    }
}
