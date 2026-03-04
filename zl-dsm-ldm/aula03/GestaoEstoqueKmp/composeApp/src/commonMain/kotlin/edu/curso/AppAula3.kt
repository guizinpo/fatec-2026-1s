package edu.curso

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AppAula3() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Agenda de Contato")
        TextField(label = { Text("Nome:")},
            placeholder = { Text("Digite seu Nome Completo" )},
            value="",
            onValueChange = {})
        Button(
            onClick = { println("Botao Apertado") }
        ) {
            Text("Clique aqui")
        }
    }
}