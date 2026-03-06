package edu.curso;

public class AlfaRomeu extends Carro {

    int numeroAirBags = 4;

    // public AlfaRomeu() {
    //     super("Alfa Romeo", "164");
    //     System.out.println("AlfaRomeu criado: " + marca + " " + modelo);
    // }

    public AlfaRomeu() {
        super();
        this.marca = "Alfa Romeo";
        this.modelo = "164";
        System.out.println("AlfaRomeu criado: " + marca + " " + modelo);
    }


    
}
