package com.labo4.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import com.labo4.viewmodels.UsuarioViewModel
import com.labo4.ui.components.UsuarioCard

@Composable
fun UsuarioScreen(viewModel: UsuarioViewModel = viewModel()) {
    val usuarios by viewModel.usuarios.collectAsState() // requiere import getValue

    LaunchedEffect(Unit) {
        viewModel.cargarUsuarios()
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Usuarios", style = androidx.compose.material3.MaterialTheme.typography.headlineSmall)
        LazyColumn {
            items(usuarios) { usuario ->
                UsuarioCard(
                    usuario = usuario,
                    onClick = { viewModel.seleccionarUsuario(usuario) },
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
        }
    }
}package com.labo4.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import com.labo4.viewmodels.UsuarioViewModel
import com.labo4.ui.components.UsuarioCard

@Composable
fun UsuarioScreen(viewModel: UsuarioViewModel = viewModel()) {
    val usuarios by viewModel.usuarios.collectAsState() // requiere import getValue

    LaunchedEffect(Unit) {
        viewModel.cargarUsuarios()
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Usuarios", style = androidx.compose.material3.MaterialTheme.typography.headlineSmall)
        LazyColumn {
            items(usuarios) { usuario ->
                UsuarioCard(
                    usuario = usuario,
                    onClick = { viewModel.seleccionarUsuario(usuario) },
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
        }
    }
}