package edu.curso.estoque

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

class GestaoEstoqueViewModel : ViewModel() {
    var produtos = mutableListOf<Produto>(
        Produto(
            id = 1,
            categoria = "Eletrônicos",
            sku = "ELEC-001",
            nome = "Smartphone XYZ",
            descricao = "Smartphone com tela de 6.5 polegadas, 128GB de armazenamento e câmera de 48MP.",
            estoqueMinimo = 10.0,
            ativo = true,
            criadoEm = "2024-01-15",
            imagem = "https://example.com/smartphone_xyz.jpg"
        ),
        Produto(
            id = 2,
            categoria = "Eletrodomésticos",
            sku = "ELETRO-002",
            nome = "Geladeira ABC",
            descricao = "Geladeira com capacidade de 300 litros, eficiência energética A++ e dispenser de água.",
            estoqueMinimo = 5.0,
            ativo = true,
            criadoEm = "2024-02-20",
            imagem = "https://example.com/geladeira_abc.jpg"
        )
    )
    var categoria by mutableStateOf("")
    var sku by mutableStateOf("")
    var nome by mutableStateOf("")
    var descricao by mutableStateOf("")
    var estoqueMinimo : Double? by mutableStateOf(0.0)
    var ativo by mutableStateOf(true)
    var criadoEm by mutableStateOf("")
    var imagem by mutableStateOf("")

    val backstack = mutableStateOf<NavBackStack<NavKey>>(NavBackStack(Rota.Formulario ))

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