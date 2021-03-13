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
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Password
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Screen2(
    navigation: Navigation
) {
    val bgCol = if (isSystemInDarkTheme()) Color(0xFF232323) else Color.White
    val fgCol = if (!isSystemInDarkTheme()) Color(0xFF232323) else Color.White
    Surface(color = bgCol) {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    painter = painterResource(id = R.drawable.ic_login_bg),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                )
                VerticalSpacer(size = 40.dp)
                val (txt, setTxt) = remember(calculation = { mutableStateOf("") })
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .padding(horizontal = 16.dp),
                    value = txt,
                    onValueChange = setTxt,
                    leadingIcon = {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            imageVector = Icons.Default.MailOutline,
                            contentDescription = "email",
                        )
                    },
                    label = {
                        Text("Email address", style = MaterialTheme.typography.body1)
                    },
                    textStyle = MaterialTheme.typography.body1,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = fgCol,
                        trailingIconColor = fgCol,
                        placeholderColor = fgCol,
                        cursorColor = fgCol,
                        focusedBorderColor = fgCol,
                        unfocusedBorderColor = fgCol,
                    ),
                )
                VerticalSpacer(size = 8.dp)
                val (txt2, setTxt2) = remember(calculation = { mutableStateOf("") })
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .padding(horizontal = 16.dp),
                    value = txt2,
                    onValueChange = setTxt2,
                    leadingIcon = {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            imageVector = Icons.Default.Password,
                            contentDescription = "password",
                        )
                    },
                    label = {
                        Text("Password", style = MaterialTheme.typography.body1)
                    },
                    textStyle = MaterialTheme.typography.body1,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = fgCol,
                        trailingIconColor = fgCol,
                        placeholderColor = fgCol,
                        cursorColor = fgCol,
                        focusedBorderColor = fgCol,
                        unfocusedBorderColor = fgCol,
                    ),
                )
                VerticalSpacer(size = 16.dp)
                Button(
                    modifier = Modifier
                        .height(48.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(50),
                    onClick = { navigation.navigate("screen3") }
                ) {
                    Text(text = "LOG IN")
                }
            }
            Text(
                style = MaterialTheme.typography.h2,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .paddingFromBaseline(top = 152.dp),
                text = "Welcome\nback"
            )
        }
    }
}
