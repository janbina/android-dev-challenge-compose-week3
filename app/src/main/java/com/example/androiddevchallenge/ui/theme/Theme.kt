/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val DarkColorPalette = darkColors(
    primary = Color(0xFFe3da00),
    primaryVariant = Color(0xFFFF0000),
    secondary = Color(0xFFFF0000),
    background = Color(0xFF232323),
    surface = Color(0xFF2d2d2d),
    onPrimary = Color(0xFF232323),
    onSecondary = Color(0xFFFF0000),
    onBackground = Color(0xFFFFFFFF),
    onSurface = Color(0xFFFFFFFF),
)

private val LightColorPalette = lightColors(
    primary = Color(0xFFe3da00),
    primaryVariant = Color(0xFFFF0000),
    secondary = Color(0xFFFF0000),
    background = Color(0xFF322049),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color(0xFF232323),
    onSecondary = Color(0xFFFF0000),
    onBackground = Color(0xFFFFFFFF),
    onSurface = Color(0xFF232323),
)

val CustomGreen = Color(0xFF39a844)
val CustomRed = Color(0xFFd93c19)

@Composable
fun MyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = Shapes(
            small = RoundedCornerShape(4.dp),
            large = RoundedCornerShape(48.dp)
        ),
        content = content
    )
}
