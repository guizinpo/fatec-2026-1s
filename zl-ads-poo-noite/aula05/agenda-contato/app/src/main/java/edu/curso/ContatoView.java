package edu.curso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ContatoView {

    private ArrayList<Contato> lista = new ArrayList<>();

    public static void main(String[] args) {
        ContatoView view = new ContatoView();
        view.menu();
    }

    public void cadastrar( Scanner input ) {
        System.out.println("Nome Completo: ");
        String nome = input.nextLine();
        System.out.println("Telefone: ");
        String telefone = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        System.out.println("Nascimento DD/MM/YYYY: ");
        String strNascimento = input.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contato c = new Contato();
        c.setNome( nome );
        c.setTelefone( telefone );
        c.setEmail( email );
        LocalDate data = LocalDate.parse( strNascimento, dtf );
        c.setNascimento( data );

        lista.add ( c );
    }

    public void listarContatos() { 
        // for (int i = 0; i < lista.size(); i++) {
        //     Contato c = lista.get( i ); 
        // }
        for (Contato c : lista) { 
            System.out.println("------------------------------------");
            System.out.printf("%s - %s%n", c.getNome(), c.getTelefone());
            System.out.printf("%s - %s%n", c.getEmail(), c.getNascimento());
        }
    }

    public void menu() {
        System.out.println("Gestão de Contatos");
        String menu = """
                M E N U  D E  O P C O E S
                (C)adastrar Contato
                (R)emover Contato
                (E)ditar Contato
                (L)istar Contatos
                (P)esquisar Contato Especifico
                (F)inalizar
                """;
        
        boolean isExecutando = true;
        try (Scanner input = new Scanner( System.in )) {
            while (isExecutando) { 
                System.out.println( menu );
                System.out.print("Escolha uma opcao ==>");
                String opcao = input.nextLine();
                char op = opcao.toUpperCase().charAt(0);
                switch( op ) { 
                    case 'C' : { cadastrar( input ); break; }
                    case 'R' : { break; }
                    case 'E' : { break; }
                    case 'L' : { listarContatos(); break; }
                    case 'P' : { break; }
                    case 'F' : { isExecutando = false; break; }
                    default : {
                        System.out.println("Por favor digite uma opcao valida");
                    }
                }
            }
        } catch( Exception err ) { 
            System.out.println("Deu erro: " + err.getMessage());
            err.printStackTrace();
        } 
        System.out.println("Obrigado por usar nosso sistema");
    }
    
}
