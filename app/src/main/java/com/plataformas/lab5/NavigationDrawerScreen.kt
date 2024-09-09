package com.plataformas.lab5

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
fun NavigationDrawerScreen(title : String, context: Context, content: @Composable (PaddingValues) -> Unit) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Surface(
                color = MaterialTheme.colorScheme.background,
                modifier = Modifier.fillMaxHeight().width(200.dp)
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
                        Text(text = "Eventos",
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    TextButton(onClick = {
                        val intent = Intent(context, PlacesActivity::class.java)
                        context.startActivity(intent)
                        scope.launch { drawerState.close() }
                    }) {
                        Text(text = "Lugares",
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    TextButton(onClick = {
                        val intent = Intent(context, ProfileActivity::class.java)
                        context.startActivity(intent)
                        scope.launch { drawerState.close() }
                    }) {
                        Text(text = "Perfil",
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                    }
                }
            }
        },
        content = {
            Scaffold(
                topBar = {
                    Row(
                        modifier = Modifier
                            .height(90.dp)
                            .fillMaxWidth().background(color = MaterialTheme.colorScheme.secondary).
                            padding(top = 24.dp).padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
                    ) {
                        Text(
                            text = title,
                            fontSize = 20.sp,
                            color = colorResource(R.color.black),
                            fontWeight = FontWeight.Bold

                        )
                        IconButton(onClick = { scope.launch { drawerState.open() } },modifier = Modifier.size(24.dp)) {
                            Icon(Icons.Default.Menu, contentDescription = "Menu")
                        }
                    }
//                    Box(
//                        modifier = Modifier
//                            .padding(horizontal = 16.dp)
//                            .padding(top = 24.dp)
//                    ) {
//                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
//                            Icon(Icons.Default.Menu, contentDescription = "Menu")
//                        }
//                    }
                },
                content = { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        content(innerPadding)
                    }
                }
            )
        }
    )
}