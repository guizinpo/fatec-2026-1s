package edu.curso

//public class Aluno {
//    private String nome = "";
//    public String getNome() {
//        return this.nome;
//    }
//    public void setNome( Strin nome ) {
//        this.nome = nome
//    }
//}

data class Aluno ( val nome : String = "" )

fun main() {
    var nome : String? = null
    nome = "Joao"

    val a1 = Aluno( "Joao Silva")
    val a2 = Aluno( "Joao Silva")
    println("Hello World")

    nome = "Maria Silva"

    println(a1)

    if (nome != null) {
        println("Nome em maiusculo: ${nome.uppercase()}")
    }
    println("Nome em maiusculo: ${nome?.uppercase()}")

    // System.out.println("Teste")

    if (a1 == a2) {
        println("Este alunos são iguais")
    } else {
        println("Este alunos são diferentes")
    }

    if (a1 === a2) {
        println("Estas variaveis são da mesma instância")
    } else {
        println("Estas variaveis são de instâncias diferentes")
    }

    val valorInteiro = "101".toInt()

    println("Digite seu nome: ")
    val nomCompleto = readln() // ou readLine()
    println("Olá $nomCompleto")

}