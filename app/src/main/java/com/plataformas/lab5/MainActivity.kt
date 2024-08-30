package com.plataformas.lab5

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plataformas.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab5Theme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .background(color = MaterialTheme.colorScheme.primary)) { innerPadding ->
                    MainLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth().background(color = MaterialTheme.colorScheme.secondary),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Text(
                text = "TodoEventos",
                fontSize = 20.sp,
                color = colorResource(R.color.black),
                modifier = Modifier.padding(start = 16.dp),
                fontWeight = FontWeight.Bold

            )
            Image(
                painter = painterResource(R.drawable.baseline_menu_24),
                contentDescription = "menu",
                modifier = Modifier.size(24.dp).padding(end = 16.dp)
            )
        }
        EventGrid()


    }
}

@Composable
fun EventCard(evento: Event) {
    Column(
        modifier = Modifier
            .padding(0.dp)
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(16.dp)
            )

    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Event Image",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(12.dp))
        )
        Column(
            modifier = Modifier.padding(8.dp)
        ){
            Text(
                text = evento.titulo,
                modifier = Modifier.padding(vertical = 4.dp),
                fontSize = 16.sp,
                color = colorResource(R.color.black),
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = evento.lugar,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@Composable
fun EventGrid() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            item(span = { GridItemSpan(maxLineSpan) }) {
                Text(
                    text = "Your Favorites",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
            }
            items(eventos.filter { it.favorite }) { evento ->
                    EventCard(evento)
            }
            item(span = { GridItemSpan(maxLineSpan) }) {
                Text(
                    text = "All Events",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
            }
            items(eventos.filter { !it.favorite }) { evento ->

                EventCard(evento)

            }
        }
    }
}

