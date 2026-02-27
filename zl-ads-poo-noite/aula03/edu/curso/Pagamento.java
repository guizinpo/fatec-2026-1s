package edu.curso;

public class Pagamento {
    
    double orcamento = 65000.0;

    // public void fazerPagamento( float salario, float vt ) { 
    //     fazerPagamento( salario, vt, 0.0f, 0.0f );
    // }

    // public void fazerPagamento( float salario, float vt, float vr ) { 
    //     fazerPagamento( salario, vt, vr, 0.0f );
    // }

    // public void fazerPagamento( float salario, float vt, float vr, float plr ) { 

    public void fazerPagamento( float salario, float ... beneficios) {
        orcamento -= salario;
        // orcamento -= vt;
        // orcamento -= vr;
        //  orcamento -= plr;

        for (float b : beneficios) { 
            orcamento -= b;
        }


        System.out.println("Novo orçamento é de: " + orcamento);
    }

    public static void main(String[] args) {
        Pagamento p1 = new Pagamento();
        p1.fazerPagamento(1000.0f, 20.0f, 10.0f);
        p1.fazerPagamento(1000.0f, 20.0f, 20.0f, 10.0f);
        p1.fazerPagamento(1000.0f);
    }

}
