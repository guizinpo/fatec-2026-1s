package edu.curso.estoque

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ClearAll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.ToggleButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.curso.estoque.theme.AppTheme


@OptIn(ExperimentalMaterial3ExpressiveApi::class,
        ExperimentalMaterial3Api::class)
@Composable
fun App() {
    val vm = viewModel { GestaoEstoqueViewModel() }
    AppTheme(darkTheme = false) {
        Scaffold(
            topBar = { TopAppBar(title = { Text("Gestão de Produto") },
                        actions = { IconButton(onClick = { vm.limparCampos() } ) {
                            Icon(   imageVector = Icons.Outlined.ClearAll,
                                    contentDescription = "Limpar Campos"  )}
                        })
                     },
            bottomBar = { BottomAppBar { Text("Fatec Itaquera") } }
        ) {
            Column() {
                TextField(
                    value = "", onValueChange = {},
                    label = { Text("Id:") })
                TextField(
                    value = vm.categoria,
                    onValueChange = { vm.categoria = it },
                    label = { Text("Categoria:") },
                    placeholder = { Text("Categoria do Produto:") })
                TextField(
                    value = vm.sku,
                    onValueChange = { vm.sku = it },
                    label = { Text("SKU:") },
                    placeholder = { Text("SKU Codigo interno do produto:") })
                TextField(
                    value = vm.nome,
                    onValueChange = { vm.nome = it },
                    label = { Text("Nome:") },
                    placeholder = { Text("Nome do Produto:") })
                TextField(
                    value = vm.descricao ?: "",
                    onValueChange = { vm.descricao = it },
                    label = { Text("Descrição:") },
                    placeholder = { Text("Descrição do Produto:") })
                TextField(
                    value = vm.estoqueMinimo.toString() ?: "0.0",
                    onValueChange = { vm.estoqueMinimo = it.toDoubleOrNull() },
                    label = { Text("Estoque Minimo:") },
                    placeholder = { Text("Estoque mínimo permitido para este Produto:") })
                ToggleButton(checked = vm.ativo, onCheckedChange = { vm.ativo = it }) {
                    Text("Ativo")
                }
                TextField(
                    value = vm.criadoEm,
                    onValueChange = { vm.criadoEm = it },
                    label = { Text("Cadastrado em:") },
                    placeholder = { Text("Data de cadastro do Produto:") })
                TextField(
                    value = vm.imagem ?: "",
                    onValueChange = { vm.imagem = it },
                    label = { Text("Imagem:") },
                    placeholder = { Text("URL da imagem do Produto:") })
                Row {
                    Button(onClick = { vm.salvar() }) {
                        Text("Salvar")
                    }
                    Button(onClick = { vm.pesquisar() }) {
                        Text("Pesquisar")
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun AppPreview() {
    App()
}