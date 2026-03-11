package edu.curso

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ProdutoViewModel : ViewModel() {
    var categoria : String by mutableStateOf("")
    var sku : String by mutableStateOf("")
    var nome : String by mutableStateOf("")
    var descricao : String by mutableStateOf("")
    var estoqueMinimo : String by mutableStateOf("")
    var ativo : Boolean by mutableStateOf(false)
    var criadoEm : String by mutableStateOf("")
    var imagemUrl : String by mutableStateOf("")
    var isDarkTheme : Boolean by mutableStateOf(false)
    var lista : MutableList<Produto> = mutableListOf()

    fun iconeThema() =
        if (isDarkTheme) Icons.Filled.LightMode else Icons.Filled.DarkMode

    fun toggleDarkTheme() {
        isDarkTheme = !isDarkTheme
    }

    fun salvar() {
        println("Salvando...")
        val p = Produto(
            id = lista.size + 1L,
            categoria = categoria,
            sku = sku,
            nome = nome,
            descricao = descricao,
            estoqueMinimo = estoqueMinimo.toDoubleOrNull(),
            ativo = ativo,
            criadoEm = criadoEm,
            imagem = imagemUrl
        )
        lista.add(p)
    }

    fun limparCampos() {
        categoria = ""
        sku = ""
        nome = ""
        descricao = ""
        estoqueMinimo = ""
        ativo = false
        criadoEm = ""
        imagemUrl = ""
    }

    fun pesquisar() {
        println("Pesquisar...")
        for (prod in lista) {
            if (prod.nome.contains(nome)) {
                categoria = prod.categoria
                sku = prod.sku
                nome = prod.nome
                descricao = prod.descricao ?: ""
                estoqueMinimo = prod.estoqueMinimo.toString()
                ativo = prod.ativo
                criadoEm = prod.criadoEm
                imagemUrl = prod.imagem ?: ""
            }
        }
    }
}