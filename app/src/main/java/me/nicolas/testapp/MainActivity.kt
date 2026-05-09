package me.nicolas.testapp

import android.os.Bundle
import android.webkit.WebSettings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.nicolas.testapp.ui.theme.TestAppTheme
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.blur
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment.Horizontal
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPantallaDos()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello Mundo.",
        modifier = modifier
    )
}

@Composable
fun myApp(){
    Column(modifier = Modifier
        .background(Color.Yellow)
        .fillMaxSize()
        .padding(all = 15.dp)) {
    Row(
    modifier = Modifier
        .background(Color.Red)
        .fillMaxWidth()
    ){
        Text(text = "Inicio",
            modifier = Modifier
                .padding(all = 15.dp)
                .background(Color.Magenta)
                .padding(all = 15.dp)
                .weight(weight = 1f))
        Text(text = "Perfil",
            modifier = Modifier
                .padding(all = 15.dp)
                .background(Color.Magenta)
                .padding(all = 15.dp)
                .weight(weight = 1f))
        Text(text = "Configuracion",
            modifier = Modifier
                .padding(all = 15.dp)
                .background(Color.Magenta)
                .padding(all = 15.dp)
                .weight(weight = 2f))

    }

    }




}

@Composable
fun prueba(){
    Column(modifier = Modifier.fillMaxSize()){
        Row(modifier = Modifier.weight(1f))
        {
            Column(
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(text = "Text Compose", modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                Text(text = "Displays text and follows the recommended Material Design guidelines.", modifier = Modifier.padding(10.dp),
                    textAlign = TextAlign.Justify)
            }
            Column(
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(text = "Text Compose", modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                Text(text = "Creates a composable that lays out and draws a given Painter class object.", modifier = Modifier.padding(10.dp),
                    textAlign = TextAlign.Justify)
            }
        }

        Row(modifier = Modifier.weight(1f))
        {
            Column(
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(text = "Text Compose", modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                Text(text = "A layout composable that places its children in a horizontal sequence.", modifier = Modifier.padding(10.dp),
                    textAlign = TextAlign.Justify)
            }
            Column(
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(text = "Text Compose", modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                Text(text = "A layout composable that places its children in a vertical sequence.", modifier = Modifier.padding(10.dp),
                    textAlign = TextAlign.Justify)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PruebaPreview() {
    TestAppTheme {
        prueba()
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    TestAppTheme {
        myApp()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun MiPantallaDos(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text(text = "Top App Bar")},
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    ),
                    navigationIcon = {
                        Icon(
                            imageVector = Icons.Default.Add, contentDescription = null
                        )
                    }
            )
        },
        bottomBar = {
            BottonBar()
        }

    ){
        innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)){
            BodyScreen()
        }
    }
}

@Composable
fun BodyScreen(){
    Column(modifier = Modifier.padding(16.dp)){
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            label = {Text("Escribe Algo")},
            trailingIcon = {
                Icon(Icons.Default.Search, contentDescription = null)
            },
            leadingIcon = {
                Icon(Icons.Default.Close, contentDescription = null)
            }
        )

        Button(onClick = {}) { }
    }
}

@Composable
fun BottonBar(){
    NavigationBar() {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.Home, contentDescription = null)},
            label = {Text("Home")}
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.Favorite, contentDescription = null)},
            label = {Text("Favoritos")}
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.Settings, contentDescription = null)},
            label = {Text("Ajustes")}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TrabajoClase(){
    Column(
        modifier = Modifier
            .background(Color(0xFFEADDFF))
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Encabezado", modifier = Modifier.background(Color.Blue)
            .padding(16.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .padding(30.dp),

            horizontalArrangement = Arrangement.SpaceAround) {Text(text = "Item 1", modifier = Modifier.background(Color.Yellow)
            .padding(16.dp))
            Text(text = "Item 2", modifier = Modifier.background(Color.Red)
                .padding(16.dp))
            Text(text = "Item 3", modifier = Modifier.background(Color.Gray)
                .padding(16.dp))}

        Text(text = "Pie de página", modifier = Modifier.background(Color.Magenta)
            .padding(16.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun TrabajoClaseDos() {
    Column(
        modifier = Modifier
            .background(Color(0xFFEADDFF))
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.cicla),
            contentDescription = "Ciclista",
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Juan Pérez",
            modifier = Modifier.padding(16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            text = "Desarrollador Andorid apasionado por la tecnología y el diseño",
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "150", fontWeight = FontWeight.Bold)
            Text(text = "2.3k", fontWeight = FontWeight.Bold)
            Text(text = "980", fontWeight = FontWeight.Bold)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "Posts")
            Text(text = "Seguidores")
            Text(text = "Likes")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier.weight(1f)
                        .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE))

            ) {
                Text(text = "Seguir")
            }
            OutlinedButton(
                onClick = {},
                modifier = Modifier.weight(1f)
                    .fillMaxWidth(),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF6200EE))
            ) {
                Text(text = "Mensaje")
            }
        }

        Text(
            text = "Intereses",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = {}) {
                Text(text = "Ciclismo", fontSize = 10.sp)
            }
            Button(onClick = {}) {
                Text(text = "Programación", fontSize = 10.sp)
            }
            Button(onClick = {}) {
                Text(text = "UI/UX", fontSize = 10.sp)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = {}) {
                Text(text = "Musica", fontSize = 10.sp)
            }
            Button(onClick = {}) {
                Text(text = "Viajes", fontSize = 10.sp)
            }
            Button(onClick = {}) {
                Text(text = "Gaming", fontSize = 10.sp)
            }
        }

        Text(
            text = "Proyectos Recientes",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 14.dp),
            shape = androidx.compose.ui.graphics.RectangleShape,
            colors = CardDefaults.cardColors(containerColor = Color.Gray)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.cicla),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                )
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .weight(2f)
                ) {
                    Text(
                        text = "App de Ciclismo",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Text(
                        text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)),
                        modifier = Modifier
                            .padding(5.dp)
                            .align(Alignment.End)
                    ) {
                        Text(text = "Ver mas", fontSize = 10.sp)
                    }
                }
            }
        }

    }


}