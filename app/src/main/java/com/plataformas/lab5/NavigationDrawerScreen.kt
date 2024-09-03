package com.plataformas.lab5

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun NavigationDrawerScreen(context: Context, content: @Composable (PaddingValues) -> Unit) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Surface(
                color = Color.White,
                modifier = Modifier.fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp, top = 48.dp, end = 16.dp)
                ) {
                    Text(text = "Menu", style = MaterialTheme.typography.titleLarge)
                    Spacer(modifier = Modifier.height(16.dp))
                    TextButton(onClick = {
                        val intent = Intent(context, MainActivity::class.java)
                        context.startActivity(intent)
                        scope.launch { drawerState.close() }
                    }) {
                        Text(text = "Eventos")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    TextButton(onClick = {
                        val intent = Intent(context, PlacesActivity::class.java)
                        context.startActivity(intent)
                        scope.launch { drawerState.close() }
                    }) {
                        Text(text = "Lugares")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    TextButton(onClick = {
                        val intent = Intent(context, ProfileActivity::class.java)
                        context.startActivity(intent)
                        scope.launch { drawerState.close() }
                    }) {
                        Text(text = "Perfil")
                    }
                }
            }
        },
        content = {
            Scaffold(
                topBar = {
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .padding(top = 24.dp)
                    ) {
                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
                            Icon(Icons.Default.Menu, contentDescription = "Menu")
                        }
                    }
                },
                content = { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
                        content(innerPadding)
                    }
                }
            )
        }
    )
}