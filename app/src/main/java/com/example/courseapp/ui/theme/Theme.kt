package com.example.courseapp.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

// Define your colors for Dark and Light themes
private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EE),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onSurface = Color.Black
)

@Composable
fun CourseAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        // Dynamic color is available on Android 12+ (API level 31)
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    // Apply MaterialTheme with the correct color scheme, typography, and content
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography(),
        content = content
    )
}

// Preview function to see the theme in action
@Preview(showBackground = true)
@Composable
fun PreviewCourseAppTheme() {
    CourseAppTheme {
        // Add your preview content here, e.g., a simple Text to test
        Text(text = "CourseApp Theme Preview", style = MaterialTheme.typography.headlineMedium)
    }
}
