package hu.frzee.morningtarot.views


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import android.content.res.Configuration
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import hu.frzee.morningtarot.R
import hu.frzee.morningtarot.themes.MorningTarotTheme
import hu.frzee.morningtarot.themes.Typography_Card
import hu.frzee.morningtarot.themes.bigelowRulesFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlarmSet(
    onBackNavigate : () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Ébresztő",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        lineHeight = 5.77.em,
                        style = TextStyle(
                            fontSize = 26.sp,
                            fontWeight = FontWeight.Bold))
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBackNavigate
                    ) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .requiredSize(size = 48.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .clip(shape = RoundedCornerShape(100.dp))
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .padding(all = 8.dp)
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.arrow_back_24),
                                        contentDescription = "Icons/arrow_back_24px",
                                        tint = Color(0xff250e44))
                                }
                            }
                        }
                    }
                },
                actions = {
                    Spacer(
                        modifier = Modifier
                            .requiredHeight(height = 48.dp))
                })
        },
        modifier = modifier
    ) {

            innerPadding ->  val contentModifier = Modifier.padding(innerPadding)
       /* Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 656.dp)
                .background(color = Color.White)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(11.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(height = 303.dp)
                    .padding(all = 8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(height = 106.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .align(alignment = Alignment.Center)
                            .offset(x = 0.dp,
                                y = 0.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .requiredWidth(width = 344.dp)
                                .padding(horizontal = 24.dp)
                        ) {
                            Selectedfalse(
                                modifier = Modifier
                                    .weight(weight = 0.5f))
                            Text(
                                text = ":",
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                lineHeight = 1.12.em,
                                style = TextStyle(
                                    fontSize = 57.sp),
                                modifier = Modifier
                                    .requiredWidth(width = 24.dp)
                                    .requiredHeight(height = 72.dp)
                                    .wrapContentHeight(align = Alignment.CenterVertically))
                            Selectedfalse(
                                modifier = Modifier
                                    .weight(weight = 0.5f))
                        }
                    }
                }
                Horizontalfullwidth()
                Property1Default()
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight = 1f)
                    .padding(horizontal = 8.dp)
            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Jelzés neve",
                            color = Color(0xff0d154b),
                            lineHeight = 1.33.em,
                            style = MaterialTheme.typography.bodySmall)
                    },
                    placeholder = { Text("Név") },
                    textStyle = MaterialTheme.typography.bodyLarge,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color(0xff4a454e),
                        containerColor = Color(0xffdfe0ff)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(height = 56.dp)
                        .clip(shape = RoundedCornerShape(6.dp)))
                Condition2lineLeadingNoneTrailingSwitchShowOverlineFalseShowSuppo()
                Condition2lineLeadingNoneTrailingSwitchShowOverlineFalseShowSuppo()
                Condition2lineLeadingNoneTrailingSwitchShowOverlineFalseShowSuppo()
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(64.dp, Alignment.CenterHorizontally),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffdfe0ff)),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                    modifier = Modifier
                        .requiredHeight(height = 40.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredHeight(height = 40.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Text(
                                text = "Mentés",
                                color = Color(0xff0d154b),
                                textAlign = TextAlign.Center,
                                lineHeight = 1.43.em,
                                style = MaterialTheme.typography.labelLarge,
                                modifier = Modifier
                                    .wrapContentHeight(align = Alignment.CenterVertically))
                        }
                    }
                }
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xffdfe0ff)),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                    modifier = Modifier
                        .requiredHeight(height = 40.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredHeight(height = 40.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Text(
                                text = "Mégse",
                                color = Color(0xff0d154b),
                                textAlign = TextAlign.Center,
                                lineHeight = 1.43.em,
                                style = MaterialTheme.typography.labelLarge,
                                modifier = Modifier
                                    .wrapContentHeight(align = Alignment.CenterVertically))
                        }
                    }
                }
            }
        }
        ConfigurationiconLabelSegments3()*/

    }

}
/*
@Composable
fun Selectedfalse(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.Top),
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(1.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 72.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(color = Color(0xff6b538c))
                .padding(horizontal = 16.dp,
                    vertical = 9.dp)
        ) {
            Text(
                text = "45",
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = 1.16.em,
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.CenterVertically))
        }
    }
}

@Composable
fun Horizontalfullwidth(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(height = 4.dp)
            .padding(vertical = 10.dp)
    ) {
        Divider(
            color = Color(0xff7b757f),
            modifier = Modifier
                .fillMaxWidth())
    }
}

@Composable
fun Property1Default(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xfff9f1f9))
            .padding(all = 10.dp)
    ) {
        Text(
            text = "Holnap",
            color = Color(0xff1d1a20),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold))
        Property1HKSCPSV()
    }
}

@Composable
fun Property1HKSCPSV(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
        modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(7.dp, Alignment.Start),
            modifier = Modifier
                .padding(horizontal = 5.dp)
        ) {
            Property1SelectedActiveTrue()
            Property1SelectedActiveTrue()
            Property1NonselectedActiveTrue()
            Property1SelectedActiveTrue()
            Property1NonselectedActiveTrue()
            Property1NonselectedActiveTrue()
            Property1NonselectedActiveTrue()
        }
    }
}

@Composable
fun Property1SelectedActiveTrue(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(start = 2.dp,
                end = 2.dp,
                bottom = 4.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xffeaddff))
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(all = 6.dp)
            ) {
                Text(
                    text = "Csüt",
                    color = Color(0xff6b538c),
                    textAlign = TextAlign.Center,
                    lineHeight = 1.33.em,
                    style = TextStyle(
                        fontSize = 12.sp,
                        letterSpacing = 0.5.sp))
            }
        }
    }
}

@Composable
fun Property1NonselectedActiveTrue(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(start = 2.dp,
                end = 2.dp,
                bottom = 4.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(100.dp))
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(all = 6.dp)
            ) {
                Text(
                    text = "Vas",
                    color = Color(0xff6b538c),
                    textAlign = TextAlign.Center,
                    lineHeight = 1.33.em,
                    style = TextStyle(
                        fontSize = 12.sp,
                        letterSpacing = 0.5.sp))
            }
        }
    }
}

@Composable
fun Condition2lineLeadingNoneTrailingSwitchShowOverlineFalseShowSuppo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(6.dp))
            .background(color = Color(0xfffff7ff))
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .requiredWidth(width = 344.dp)
                .requiredHeight(height = 56.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp,
                        end = 24.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(weight = 1f)
                ) {
                    Text(
                        text = "Szundi",
                        color = Color(0xff6b538c),
                        lineHeight = 1.5.em,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Text(
                        text = "",
                        color = Color(0xff4a454e),
                        lineHeight = 1.43.em,
                        style = TextStyle(
                            fontSize = 14.sp,
                            letterSpacing = 0.25.sp),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .fillMaxWidth())
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top)
                ) {
                    SelectedfalseStateenabledIconfalse()
                }
            }
        }
        BuildingBlocksstatelayer1Enabled()
    }
}

@Composable
fun SelectedtrueStateenabledIconfalse(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 52.dp)
            .requiredHeight(height = 32.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xff6b538c))
                .border(border = BorderStroke(1.dp, Color(0xff7b757f)),
                    shape = RoundedCornerShape(100.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.CenterEnd)
                .offset(x = 8.dp,
                    y = 0.dp)
                .requiredSize(size = 48.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .requiredSize(size = 24.dp)
                    .clip(shape = RoundedCornerShape(23.dp))
                    .background(color = Color.White))
        }
    }
}

@Composable
fun BuildingBlocksstatelayer1Enabled(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize())
}

@Composable
fun SelectedfalseStateenabledIconfalse(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 52.dp)
            .requiredHeight(height = 32.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xffe7e0e8))
                .border(border = BorderStroke(2.dp, Color(0xff7b757f)),
                    shape = RoundedCornerShape(100.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .offset(x = (-8).dp,
                    y = 0.dp)
                .requiredSize(size = 48.dp)
        ) {
            val checkedState = remember { mutableStateOf(true) }
            Checkbox(
                checked = checkedState.value,
                onCheckedChange = { checkedState.value = it },
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .offset(x = 0.dp,
                        y = 0.dp))
        }
    }
}

@Composable
fun ConfigurationiconLabelSegments3(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .background(color = Color(0xffe8e7e9))
            .padding(horizontal = 8.dp)
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.menu_24px),
                    contentDescription = "Icon",
                    tint = Color(0xff4a454e))
            },
            alwaysShowLabel = true,
            selected = false,
            onClick = { },
            modifier = Modifier
                .weight(weight = 0.33f))
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.check_box_outline_blank),
                    contentDescription = "Icon",
                    tint = Color(0xff4a454e))
            },
            alwaysShowLabel = true,
            selected = false,
            onClick = { },
            modifier = Modifier
                .weight(weight = 0.33f))
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.navigate_before),
                    contentDescription = "Icon",
                    tint = Color(0xff4a454e))
            },
            alwaysShowLabel = true,
            selected = false,
            onClick = { },
            modifier = Modifier
                .weight(weight = 0.33f))


    }
}
*/
@Preview(widthDp = 360, heightDp = 800,
    name = "Light Mode")
@Preview(
    widthDp = 360, heightDp = 800,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
private fun AlarmSetPreview() {
    AlarmSet({}, Modifier)
}