class Pessoa { 
	String nome;
	int idade;

	Pessoa( String nome, int idade) { 
		this.nome = nome;
		this.idade = idade;
	}
}


public class HelloWorld {
    public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Joao Silva", 32);
        System.out.println("Hello, World! Fatec ADS 4o Tarde 2026");
    }
}
