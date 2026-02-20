public class TesteStrings {


    public static void main(String[] args) {
        String s1 = "Joao";
        String s2 = "Maria";
        String s3 = "Joao";
        String s4 = s2;

        s3 = s3 + "";

        if (s1 == s2) { 
            System.out.printf("s1('%s') e igual a s2('%s')\n", s1, s2);
        } else { 
            System.out.printf("s1('%s') e diferente de s2('%s')\n", s1, s2);
        }

        if (s2 == s3) { 
            System.out.printf("s2('%s') e igual a s3('%s')\n", s2, s3);
        } else { 
            System.out.printf("s2('%s') e diferente de s3('%s')\n", s2, s3);
        }

        if (s3 == s4) { 
            System.out.printf("s3('%s') e igual a s4('%s')\n", s3, s4);
        } else { 
            System.out.printf("s3('%s') e diferente de s4('%s')\n", s3, s4);
        }        

        if (s1 == s3) { 
            System.out.printf("s1('%s') e igual a s3('%s')\n", s1, s3);
        } else { 
            System.out.printf("s1('%s') e diferente de s3('%s')\n", s1, s3);
        }      

        if (s2 == s4) { 
            System.out.printf("s2('%s') e igual a s4('%s')\n", s2, s4);
        } else { 
            System.out.printf("s2('%s') e diferente de s4('%s')\n", s2, s4);
        }           
    }
    
}
