public class TestePessoas {


    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = p1;

        if (p1 == p2) { 
            System.out.println("p1 e p2 são iguais");
        } else { 
            System.out.println("p1 e p2 são diferentes");
        }

        if (p2 == p3) { 
            System.out.println("p2 e p3 são iguais");
        } else { 
            System.out.println("p2 e p3 são diferentes");
        }

        if (p1 == p3) { 
            System.out.println("p1 e p3 são iguais");
        } else { 
            System.out.println("p1 e p3 são diferentes");
        }
    }
}
