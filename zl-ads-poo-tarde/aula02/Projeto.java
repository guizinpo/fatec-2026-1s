public class Projeto { 

    int quantidadePessoas = 4;      // Variaveis de instancia
    int horasAlocadasPorPessoa = 7;

    public void iniciarProjeto() { 
        int total = 0; // Variaveis locais
        int diasProjeto = 10;
        // int horasAlocadasPorPessoa = 6;
        System.out.println("Kick off do projeto...");

        System.out.println("Este projeto tem " + quantidadePessoas + " pessoas");
        System.out.println("Cada pessoa trabalhara " + horasAlocadasPorPessoa + " por dia no projeto");

        total = quantidadePessoas * horasAlocadasPorPessoa * diasProjeto;
        
        System.out.println("Este projeto durará " + diasProjeto + " dias");
        System.out.println("Total de horas gastas no projeto: " + total);
    }


    public static void main(String args[]) { 
        System.out.println("Inicio do programa");
        Projeto prj = new Projeto();
        prj.iniciarProjeto();
        System.out.println("Termino do programa");
    }

}