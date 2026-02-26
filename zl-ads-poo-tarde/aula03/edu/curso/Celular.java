package edu.curso;

public class Celular {
    String OS;
    boolean ligado;
    int versao;
    String cor;
    String fabricante;
    
    public void ligar() { 
        ligado = true;
        System.out.println("Aparelho ligado");
    }
    
    public int desligar() {
        int i = 2; 
        ligado = false;
        System.out.println("Aparelho desligado");
        while ( i < 10) { 
            if (i++ == 5) { 
                return 1;
            }
        }
        return 0;
    }

    public void atualizar() { 
        if (ligado) { 
            versao += 1;
            System.out.println("Celular atualizado com sucesso");
        } else {
            System.out.println("O celular precisa estar ligado para ser atualizado");
        }
    }

    public void exibirBarraAcoes() { 
        // int x = 10;
        if (ligado) {
            if ("motorola".equalsIgnoreCase(fabricante)) { 
                System.out.println("<VOLTAR> <INICIO> <TAREFAS>");
            } else { 
                System.out.println("<TAREFAS> <INICIO> <VOLTAR>");
            }
        } else {
            System.out.println("O celular precisa estar ligado para mostrar a barra de ações");
        }
    }

    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.ligar();
        c1.exibirBarraAcoes();
        int info = c1.desligar();
        System.out.println("Aparelho foi desligado com retorno: " + info);

    }
}
