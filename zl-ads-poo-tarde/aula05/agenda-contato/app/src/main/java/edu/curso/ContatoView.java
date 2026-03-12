package edu.curso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ContatoView {

    private ArrayList<Contato> lista = new ArrayList<>();
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");

    public static void main(String[] args) {
        ContatoView view = new ContatoView();
        view.menu();
    }

    public void cadastrar(Scanner input) {
        System.out.println("Informe os dados do contato");
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = input.nextLine();
        System.out.println("Digite o email: ");
        String email = input.nextLine();
        System.out.println("Digite a data de nascimento: ");
        String strNascimento = input.nextLine();
        Contato c = new Contato();
        c.setNome( nome );
        c.setTelefone(telefone);
        c.setEmail(email);
        c.setNascimento( LocalDate.parse(strNascimento, dtf) );
        lista.add( c ); 
    }

    public void listar() { 
        for (Contato c : lista) { 
            System.out.printf("%s - %s%n", c.getNome(),c.getTelefone() );
            System.out.println(c.getEmail());
            System.out.println(c.getNascimento().format( dtf ));
        }
    }

    public void menu() { 
        String menu = """
            (C)adastrar Contato
            (R)emover Contato
            (E)ditar Contato
            (L)istar Contatos
            (P)rocurar Contato Especifico
            (F)inalizar""";
        
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("G E S T Ã O  D E  C O N T A T O S");
                System.out.println( menu );
                System.out.print("Escolha a opcao ==> ");
                String digitado = input.nextLine();
                switch (digitado.toUpperCase().charAt(0)) { 
                    case 'C' : { cadastrar( input ); break; }
                    case 'R' : { /* remover(); break; */ break;}
                    case 'E' : { /* editar(); break; */ break;}
                    case 'L' : { listar(); break;}
                    case 'P' : { /* procurar(); break; */ break;}
                    case 'F' : { /* finalizar(); break; */ break;}
                    default : { System.out.println("Digite uma opcao valida");}
                }
            }

        } catch (Exception err) { 
            System.err.println( "Erro: " + err.getMessage() );
            err.printStackTrace();
        }
    }
    
}
