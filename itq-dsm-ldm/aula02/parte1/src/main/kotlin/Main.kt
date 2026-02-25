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

data class Aluno ( val nome : String = "" ) {
    operator fun plus( outro : Aluno ) : List<Aluno> {
        return listOf(this, outro)
    }

    operator fun times( numero : Int ) : List<Aluno> {
        val lista = mutableListOf<Aluno>()
        for ( i in 1 .. numero ) {
            lista.add(this)
        }
        return lista
    }
}

fun String.centralizar( largura : Int ) : String {
    val espacos = (largura - this.length) / 2
    return "${" ".repeat(espacos)}$this${" ".repeat(espacos)}"
}

/**
 *  Cria um cabeçalho usando o caracterre (=)
 */
fun imprimirCabecalho(nomeApp : String, autor : String = "" ) {
    // val espacosApp = (50 - nomeApp.length) / 2
    // val espacosAutor = (50 - autor.length) / 2
    println("=".repeat(50))
    // println("=${" ".repeat(espacosApp)}$nomeApp=${" ".repeat(espacosApp)}")
    // println("=${" ".repeat(espacosAutor)}$autor=${" ".repeat(espacosAutor)}")
    println("=${nomeApp.centralizar(48)}=")
    println("=${autor.centralizar(48)}=")
    println("=".repeat(50))
}

fun main() {
    imprimirCabecalho("Sistema de Teste do Kotlin")
    imprimirCabecalho(autor = "Joao Silva", nomeApp = "Sistema de Teste do Kotlin")
    var nome : String? = null
    nome = "Joao"

    val a1 = Aluno( "Joao Silva")
    val a2 = Aluno( "Joao Silva")
    println("Hello World")

    val a3 = a1 + a2
    println("A soma dos alunos deu $a3")

    val a4 = a1 * 8
    println("A1 * 8 deu $a4")

    var o : Any = "Texto String"
    o = 54
    o = true

    // nome = "Maria Silva"

    println(a1)

    if ( o is String ) {
        o.uppercase()
    }

    println("Nome em maiusculo: ${4 + 5} ${nome!!.uppercase()}")

    if (nome != null) {
        println("Nome em maiusculo: ${4 + 5} ${nome.uppercase()}")
    }
    println("Nome em maiusculo: ${nome?.uppercase()}")

    println("Nome em maiusculo: ${nome?.uppercase() ?: "Nome não definido"}")

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

//    println("Digite seu nome: ")
//    val nomCompleto = readln() // ou readLine()
//    println("Olá $nomCompleto")

}