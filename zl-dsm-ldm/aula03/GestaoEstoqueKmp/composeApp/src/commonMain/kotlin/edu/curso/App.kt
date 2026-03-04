package edu.curso

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


var categoria : MutableState<String> = mutableStateOf("")
var sku : String by mutableStateOf("")
var nome : String by mutableStateOf("")
var descricao : String by mutableStateOf("")
var estoqueMinimo : String by mutableStateOf("")
var ativo : Boolean by mutableStateOf(false)
var criadoEm : String by mutableStateOf("")
var imagemUrl : String by mutableStateOf("")


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

var lista : MutableList<Produto> = mutableListOf()

@Preview(backgroundColor = 0xffffffff, showSystemUi = true)
@Composable
fun App() {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding( horizontal = 5.dp, vertical = 30.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text("Gestão de Produtos", fontSize = 32.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally))
        TextField(modifier = Modifier.fillMaxWidth(),
            label = {Text("Id:")}, enabled = false,
        value = "", onValueChange = {})
        TextField(modifier = Modifier.fillMaxWidth(),
            label = {Text("Categoria:")}, placeholder = {Text("Categoria do produto")},
            value = categoria.value, onValueChange = { texto ->
                categoria.value = texto
                println("Categoria: $categoria")

            })
        TextField(modifier = Modifier.fillMaxWidth(),
            label = {Text("Sku:")}, placeholder = {Text("Código interno do produto")},
            value = sku, onValueChange = { sku = it})
        TextField(modifier = Modifier.fillMaxWidth(),
            label = {Text("Nome:")}, placeholder = {Text("Nome do produto")},
            value = nome, onValueChange = {nome = it})
        TextField(modifier = Modifier.fillMaxWidth(),
            label = {Text("Descrição:")}, placeholder = {Text("Descrição do produto")},
            value = descricao, onValueChange = {descricao = it})
        TextField(modifier = Modifier.fillMaxWidth(),
            label = {Text("Estoque Minimo:")}, placeholder = {Text("Quantidade minima de estoque permitido para o produto")},
            value = estoqueMinimo, onValueChange = {estoqueMinimo = it},
            keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Number )
        )
        Row(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically) {
            Text("Produto está ativo ?")
            Switch(checked = ativo, onCheckedChange = {ativo = it})
        }
        TextField(modifier = Modifier.fillMaxWidth(),
            label = {Text("Criado em:")}, enabled = false,
            value = criadoEm, onValueChange = {criadoEm = it})
        TextField(modifier = Modifier.fillMaxWidth(),
            label = {Text("Imagem URL:")}, placeholder = {Text("Imagem do produto")},
            value = imagemUrl, onValueChange = {imagemUrl = it},
            keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Uri )
        )
        Row(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = {
                println("Salvando...")
                val p = Produto(
                    id = lista.size + 1L,
                    categoria = categoria.value,
                    sku = sku,
                    nome = nome,
                    descricao = descricao,
                    estoqueMinimo = estoqueMinimo.toDoubleOrNull(),
                    ativo = ativo,
                    criadoEm = criadoEm,
                    imagem = imagemUrl
                )
                lista.add( p )
                categoria.value = ""
                sku = ""
                nome = ""
                descricao = ""
                estoqueMinimo = ""
                ativo = false
                criadoEm = ""
                imagemUrl = ""
            }) {
                Text("Salvar")
            }
            Button(onClick = {
                println("Pesquisar...")
                for (prod in lista) {
                    if (prod.nome.contains( nome )) {
                        categoria.value = prod.categoria
                        sku = prod.sku
                        nome = prod.nome
                        descricao = prod.descricao ?: ""
                        estoqueMinimo = prod.estoqueMinimo.toString()
                        ativo = prod.ativo
                        criadoEm = prod.criadoEm
                        imagemUrl = prod.imagem ?: ""
                    }
                }
            }) {
                Text("Pesquisar")
            }
        }
    }
}