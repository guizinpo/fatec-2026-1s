package edu.curso.estoque

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform