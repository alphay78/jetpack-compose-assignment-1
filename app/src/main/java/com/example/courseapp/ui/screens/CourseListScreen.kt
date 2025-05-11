package com.example.courseapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.courseapp.data.Course
import com.example.courseapp.ui.components.CourseCard

@Composable
fun CourseListScreen(courses: List<Course>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(courses) { course ->
            CourseCard(course = course)
        }
    }
}
