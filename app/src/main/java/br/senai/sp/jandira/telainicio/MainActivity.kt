package br.senai.sp.jandira.telainicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.telainicio.Screens.TelaCadastro
import br.senai.sp.jandira.telainicio.model.Materia
import br.senai.sp.jandira.telainicio.ui.theme.TelaInicioTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelaInicioTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                // cadastroCat()
                val listaMateria = listOf(
                    Materia(id = 1, nome_materia = "Matemática"),
                    Materia(id = 2, nome_materia = "Língua Portuguesa"),
                    Materia(id = 3, nome_materia = "História"),
                    Materia(id = 4, nome_materia = "Física")
                )
                TelaCadastro()
            }
        }
    }
}





//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
////            TelaInicioTheme {
////                val navController = rememberNavController()
////                NavHost(navController = navController, startDestination = "TelaInicio") {
////                    composable("TelaInicio") { TelaInicio(navController) }
////                    composable("TelaInicio2") { TelaInicio2(navController) }
////                }
////            }
//            TelaCadastro()
//        }
//    }
//}

//@Preview(showBackground = true)
//@Composable
//fun TelaInicioPreview() {
//    TelaInicioTheme {
//
//        TelaInicio(rememberNavController())
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun TelaInicio2Preview() {
//    TelaInicioTheme {
//        TelaInicio2(rememberNavController())
//    }
//}
//

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun TelaInicioPreview() {
//    TelaCadastro()
//}
