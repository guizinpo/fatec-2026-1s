package edu.curso.estoque

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.ToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview


var produtos = mutableListOf<Produto>()

var categoria by mutableStateOf("")
var sku by mutableStateOf("")
var nome by mutableStateOf("")
var descricao by mutableStateOf("")
var estoqueMinimo : Double? by mutableStateOf(0.0)
var ativo by mutableStateOf(true)
var criadoEm by mutableStateOf("")
var imagem by mutableStateOf("")


@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun App() {
    Column () {
        TextField( value = "", onValueChange = {} ,
            label = { Text("Id:") } )
        TextField( value = categoria,
            onValueChange = { categoria = it } ,
            label = { Text("Categoria:") },
            placeholder = { Text("Categoria do Produto:") })
        TextField( value = sku,
            onValueChange = { sku = it } ,
            label = { Text("SKU:") },
            placeholder = { Text("SKU Codigo interno do produto:") })
        TextField( value = nome,
            onValueChange = { nome = it } ,
            label = { Text("Nome:") },
            placeholder = { Text("Nome do Produto:") })
        TextField( value = descricao ?: "",
            onValueChange = { descricao = it } ,
            label = { Text("Descrição:") },
            placeholder = { Text("Descrição do Produto:") })
        TextField( value = estoqueMinimo.toString() ?: "0.0",
            onValueChange = { estoqueMinimo = it.toDoubleOrNull() } ,
            label = { Text("Estoque Minimo:") },
            placeholder = { Text("Estoque mínimo permitido para este Produto:") })
        ToggleButton( checked = ativo, onCheckedChange = { ativo = it} ) {
            Text("Ativo")
        }
        TextField( value = criadoEm,
            onValueChange = { criadoEm = it } ,
            label = { Text("Cadastrado em:") },
            placeholder = { Text("Data de cadastro do Produto:") })
        TextField( value = imagem ?: "",
            onValueChange = { imagem = it } ,
            label = { Text("Imagem:") },
            placeholder = { Text("URL da imagem do Produto:") })
        Row {
            Button(onClick = {
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
                produtos.add( produto )
                categoria = ""
                sku = ""
                nome = ""
                descricao = ""
                estoqueMinimo = 0.0
                ativo = true
                criadoEm = ""
                imagem = ""
            }) {
                Text("Salvar")
            }
            Button(onClick = {
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
            }) {
                Text("Pesquisar")
            }
        }
    }
}

@Composable
@Preview
fun AppPreview() {
    App()
}