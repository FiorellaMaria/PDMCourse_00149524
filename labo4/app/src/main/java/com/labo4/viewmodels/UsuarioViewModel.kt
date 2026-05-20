import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import com.labo4.models.Usuario

class UsuarioViewModel : ViewModel() {


    private val _usuarios = MutableStateFlow<List<Usuario>>(emptyList())

    val usuarios: StateFlow<List<Usuario>> = _usuarios

    private val _usuarioSeleccionado = MutableStateFlow<Usuario?>(null)
    val usuarioSeleccionado: StateFlow<Usuario?> = _usuarioSeleccionado

    // Modificando el estado
    fun cargarUsuarios() {
        viewModelScope.launch {
            try {
                //La llamada a Repository/API
                _usuarios.value = listOf(
                    Usuario(1, "Juan", "juan@email.com", 25),
                    Usuario(2, "María", "maria@email.com", 30)
                )
            } catch (e: Exception) {
                //Manejo de errores
            }
        }
    }

    fun seleccionarUsuario(usuario: Usuario) {
        _usuarioSeleccionado.value = usuario
    }
}