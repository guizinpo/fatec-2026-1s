public class TesteStrings { 

    public static void main(String[] args) {

        String a = "A";
        String b = a + "B";
        b = b + "B";
        
        String s1 = "Joao";
        String s2 = "Joao";
        s2 = s2 + "";

        if (s1.equals(s2)) { 
            System.out.printf("As strings s1('%s') e s2('%s') são iguais\n", s1, s2);
        } else { 
            System.out.printf("As strings s1('%s') e s2('%s') são diferentes\n", s1, s2);
        }
    }
}
