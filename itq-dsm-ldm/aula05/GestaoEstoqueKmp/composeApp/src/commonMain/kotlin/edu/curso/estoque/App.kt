package edu.curso.estoque

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ClearAll
import androidx.compose.material3.*
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
        ) { paddingValues ->
            // EstoqueFormulario( vm, paddingValues )
            EstoqueLista(vm, paddingValues)
        }
    }
}

@Composable
@Preview
fun AppPreview() {
    App()
}