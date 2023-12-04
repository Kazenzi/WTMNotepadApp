package com.example.wtmnotepadapp.Screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.wtmnotepadapp.components.NoteItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteListScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "WT Note App") },
                backgroundColor = MaterialTheme.colorScheme.primary,
                contentColor = Color.White,
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "More Icon",
                            tint = Color.White
                        )
                    }
                }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ){
                NoteItem()
                NoteItem()
                NoteItem()

            }

        },
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate("add-note") }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "add note"
                )
            }
        }
    )
}

@Preview
@Composable
fun NoteListScreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
//        NoteListScreen()
    }
}
