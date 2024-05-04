package hu.frzee.morningtarot.themes

import android.hardware.lights.Light
import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import hu.frzee.morningtarot.R


val robotoFamily = FontFamily(
    Font(R.font.roboto_black, FontWeight.Black),
    Font(R.font.roboto_blackitalic, FontWeight.Black, FontStyle.Italic),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_lightitalic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_mediumitalic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_thin, FontWeight.Thin),
    Font(R.font.roboto_thinitalic, FontWeight.Thin,  FontStyle.Italic)
)
val bigelowRulesFamily = FontFamily(
    Font(R.font.bigelowrules_regular, FontWeight.Normal)
)
val spaceMonoFamily = FontFamily(
    Font(R.font.spacemono_bold, FontWeight.Bold),
    Font(R.font.spacemono_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.spacemono_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.spacemono_regular, FontWeight.Normal)
)
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = robotoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h2 = TextStyle(
        fontFamily = spaceMonoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp
    ),
    h3 = TextStyle(
        fontFamily = spaceMonoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 26.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = bigelowRulesFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 64.sp
    ),
    h6 = TextStyle(
        fontFamily = bigelowRulesFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp
    ),
)
