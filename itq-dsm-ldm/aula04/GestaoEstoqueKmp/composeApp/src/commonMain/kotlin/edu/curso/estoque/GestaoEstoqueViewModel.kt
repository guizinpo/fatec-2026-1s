package edu.curso.estoque

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class GestaoEstoqueViewModel : ViewModel() {
    var produtos = mutableListOf<Produto>()
    var categoria by mutableStateOf("")
    var sku by mutableStateOf("")
    var nome by mutableStateOf("")
    var descricao by mutableStateOf("")
    var estoqueMinimo : Double? by mutableStateOf(0.0)
    var ativo by mutableStateOf(true)
    var criadoEm by mutableStateOf("")
    var imagem by mutableStateOf("")

    fun limparCampos() {
        categoria = ""
        sku = ""
        nome = ""
        descricao = ""
        estoqueMinimo = 0.0
        ativo = true
        criadoEm = ""
        imagem = ""
    }

    fun salvar() {
        val produto = Produto(
            id = null,
            categoria = categoria,
            sku = sku,
            nome = nome,
            descricao = descricao,
            estoqueMinimo = estoqueMinimo,
            ativo = ativo,
            criadoEm = criadoEm,
            imagem = imagem
        )
        produtos.add(produto)
        limparCampos()
    }

    fun pesquisar() {
        for (produto in produtos) {
            if (produto.nome.contains(nome, ignoreCase = true)) {
                nome = produto.nome
                categoria = produto.categoria
                sku = produto.sku
                descricao = produto.descricao ?: ""
                estoqueMinimo = produto.estoqueMinimo ?: 0.0
                ativo = produto.ativo
                criadoEm = produto.criadoEm
                imagem = produto.imagem ?: ""
            }
        }
    }
}