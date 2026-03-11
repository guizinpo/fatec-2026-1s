@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)

package edu.curso

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatPaint
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.curso.theme.AppTheme


@Preview(backgroundColor = 0xffffffff, showSystemUi = true)
@Composable
fun App() {

    val produtoVM = viewModel { ProdutoViewModel() }

    AppTheme(darkTheme = produtoVM.isDarkTheme) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            "Gestão de Produtos", fontSize = 32.sp
                        )
                    },
                    actions = {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.FormatPaint, contentDescription = "Limpar Campos")
                        }
                        IconButton(onClick = {
                            produtoVM.toggleDarkTheme()
                        }) {
                            Icon(produtoVM.iconeThema(), contentDescription = "Mode Theme")
                        }
                    },
                    modifier = Modifier
                )
            },
            bottomBar = {
                BottomAppBar {
                    Text(
                        "Fatec Zona Leste - D.S.M.", fontSize = 22.sp
                    )
                }
            },
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
                    .padding(it)
                    .border(
                        width = 1.dp, color = Color.Magenta,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(5.dp),

                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Id:") }, enabled = false,
                    value = "", onValueChange = {})
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Categoria:") }, placeholder = { Text("Categoria do produto") },
                    value = produtoVM.categoria, onValueChange = { texto ->
                        produtoVM.categoria = texto
                        println("Categoria: $produtoVM.categoria")

                    })
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Sku:") }, placeholder = { Text("Código interno do produto") },
                    value = produtoVM.sku, onValueChange = { produtoVM.sku = it })
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Nome:") }, placeholder = { Text("Nome do produto") },
                    value = produtoVM.nome, onValueChange = { produtoVM.nome = it })
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Descrição:") }, placeholder = { Text("Descrição do produto") },
                    value = produtoVM.descricao, onValueChange = { produtoVM.descricao = it })
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Estoque Minimo:") },
                    placeholder = { Text("Quantidade minima de estoque permitido para o produto") },
                    value = produtoVM.estoqueMinimo,
                    onValueChange = { produtoVM.estoqueMinimo = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 15.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Produto está ativo ?")
                    Switch(checked = produtoVM.ativo, onCheckedChange = { produtoVM.ativo = it })
                }
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Criado em:") }, enabled = false,
                    value = produtoVM.criadoEm, onValueChange = { produtoVM.criadoEm = it })
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Imagem URL:") }, placeholder = { Text("Imagem do produto") },
                    value = produtoVM.imagemUrl, onValueChange = { produtoVM.imagemUrl = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Uri)
                )
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 15.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = {
                        produtoVM.salvar()
                        produtoVM.limparCampos()
                    }) {
                        Text("Salvar")
                    }
                    Button(onClick = {
                        produtoVM.pesquisar()
                    }) {
                        Text("Pesquisar")
                    }
                }
            }
        }
    }
}