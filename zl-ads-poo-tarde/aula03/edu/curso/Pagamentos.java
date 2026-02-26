package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {
    
    double orcamento = 50000.0;

    public void fazerPagamento(float salario, List<String> beneficios, float ... valores) { 
        orcamento -= salario;
        for (float valor : valores) {
            orcamento -= valor;
        }
        salario = 3500.0f;
        for (String beneficioAtual : beneficios) {
            System.out.println("Pagando: " + beneficioAtual);
        }
        System.out.println("Orçamento atual: " + orcamento);
        beneficios.add("Auxilio Terno");
    }

    public static void main(String[] args) {
        List<String> bene = new ArrayList<>();
        Pagamentos pg = new Pagamentos();
        // pg.fazerPagamento((float)2800.0, (float)350.0);
        float sal = 2800.0f;
        bene.add("Vale Transporte");
        pg.fazerPagamento(sal, bene,350.0f);
        System.out.println("Salario atual: " + sal);
        System.out.println("Beneficios Atuais:");
        for( String b : bene) { 
            System.out.println(b);
        }

        pg.fazerPagamento(sal, bene, 350.0f, 600.0f );
        pg.fazerPagamento(sal, bene, 350.0f, 600.0f, 1000.0f );
    }


}
