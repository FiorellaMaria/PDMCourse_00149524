@Composable
fun ListaUsuariosScreen(
    viewModel: UsuarioViewModel = viewModel()
) {

    val usuarios by viewModel.usuarios.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Usuarios",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        LazyColumn {
            items(usuarios) { usuario ->
                CardComponent(usuario = usuario)
            }
        }
    }
