package com.example.courseapp.utils

import com.example.courseapp.data.Course

val sampleCourses = listOf(
    Course(
        title = "Introduction to Programming",
        code = "CS101",
        creditHours = 3,
        description = "An introductory course to programming concepts and languages.",
        prerequisites = "None"
    ),
    Course(
        title = "Data Structures",
        code = "CS201",
        creditHours = 4,
        description = "Covers basic data structures like lists, stacks, queues, trees, and graphs.",
        prerequisites = "CS101"
    ),
    Course(
        title = "Operating Systems",
        code = "CS301",
        creditHours = 4,
        description = "Explores concepts of operating system design, concurrency, memory management.",
        prerequisites = "CS201"
    ),
    Course(
        title = "Database Management Systems",
        code = "CS310",
        creditHours = 3,
        description = "Covers relational databases, SQL, normalization, and transaction management.",
        prerequisites = "CS201"
    ),
    Course(
        title = "Mobile App Development",
        code = "CS420",
        creditHours = 3,
        description = "Focuses on building mobile applications using modern frameworks like Android Compose.",
        prerequisites = "CS301"
    )
)
