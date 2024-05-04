package hu.frzee.morningtarot.themes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColors(
    primary = primary_light,
    onPrimary = onPrimary_light,
    primaryVariant = primary_lightHighContrast,
    secondary = secondary_light,
    secondaryVariant = onSecondaryContainer_light,
    onSecondary = onSecondary_light,
    onSurface = surfaceTint_light,
    background = background_light
)

private val DarkColorPalette = darkColors(
    primary = primary_dark,
    onPrimary = onPrimary_dark,
    primaryVariant = primary_lightMediumContrast,
    secondary = secondary_dark,
    secondaryVariant = onSecondaryContainer_dark,
    onSecondary = onSecondary_dark,
    onSurface = surfaceTint_dark,
    background = onPrimary_dark

)

@Composable
fun MornintTarotTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}