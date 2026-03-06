package edu.curso.estoque

data class Produto(
    var id: Long? = null,
    var categoria: String = "",
    var sku: String = "",
    var nome: String = "",
    var descricao: String? = null,
    var estoqueMinimo: Double? = 0.0,
    var ativo: Boolean = true,
    var criadoEm: String = "",
    var imagem: String? = null
)