import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState

@Composable
fun UsuarioScreen(viewModel: UsuarioViewModel = viewModel()) {

    val usuarios by viewModel.usuarios.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.cargarUsuarios()
    }

    LazyColumn {
        items(usuarios) { usuario ->
            CardComponent(
                usuario = usuario,
                onClick = { viewModel.seleccionarUsuario(usuario) }
            )
        }
    }
}