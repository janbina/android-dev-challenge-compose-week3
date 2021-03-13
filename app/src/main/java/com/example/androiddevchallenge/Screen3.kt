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

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.CustomGreen
import com.example.androiddevchallenge.ui.theme.CustomRed
import dev.chrisbanes.accompanist.insets.navigationBarsPadding

@Composable
fun Screen3(
    navigation: Navigation
) {
    Surface(color = MaterialTheme.colors.background) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            item {
                Row() {
                    TextButton(
                        modifier = Modifier
                            .weight(1f)
                            .paddingFromBaseline(top = 64.dp, bottom = 8.dp),
                        enabled = true,
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = MaterialTheme.colors.onBackground,
                            disabledContentColor = MaterialTheme.colors.onBackground
                                .copy(alpha = ContentAlpha.disabled)
                        )
                    ) {
                        Text(text = "ACCOUNT")
                    }
                    TextButton(
                        modifier = Modifier
                            .weight(1f)
                            .paddingFromBaseline(top = 64.dp, bottom = 8.dp),
                        enabled = false,
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = MaterialTheme.colors.onBackground,
                            disabledContentColor = MaterialTheme.colors.onBackground
                                .copy(alpha = ContentAlpha.disabled)
                        )
                    ) {
                        Text(text = "WATCHLIST")
                    }
                    TextButton(
                        modifier = Modifier
                            .weight(1f)
                            .paddingFromBaseline(top = 64.dp, bottom = 8.dp),
                        enabled = false,
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = MaterialTheme.colors.onBackground,
                            disabledContentColor = MaterialTheme.colors.onBackground
                                .copy(alpha = ContentAlpha.disabled)
                        )
                    ) {
                        Text(text = "PROFILE")
                    }
                }
            }
            item {
                Text(
                    modifier = Modifier
                        .paddingFromBaseline(top = 32.dp, bottom = 8.dp)
                        .padding(horizontal = 16.dp),
                    text = "Balance",
                    style = MaterialTheme.typography.subtitle1
                )
            }
            item {
                Text(
                    modifier = Modifier
                        .paddingFromBaseline(top = 48.dp, bottom = 24.dp)
                        .padding(horizontal = 16.dp),
                    text = "$73,589.01",
                    style = MaterialTheme.typography.h1
                )
            }
            item {
                Text(
                    modifier = Modifier
                        .paddingFromBaseline(top = 16.dp, bottom = 32.dp)
                        .padding(horizontal = 16.dp),
                    text = "+412.35 today",
                    color = CustomGreen,
                    style = MaterialTheme.typography.subtitle1
                )
            }
            item {
                Button(
                    elevation = null,
                    modifier = Modifier
                        .height(48.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(50),
                    onClick = { }
                ) {
                    Text(text = "TRANSACT")
                }
            }
            item {
                LazyRow(
                    modifier = Modifier.padding(top = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp)
                ) {
                    listOf("Week", "ETFs", "Stocks", "Funds", "Something else").forEach {
                        item {
                            Chip(text = it, icon = it == "Week")
                        }
                    }
                }
            }
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(top = 16.dp, bottom = 32.dp),
                    painter = painterResource(id = R.drawable.ic_home_illos),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                )
            }
            item {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colors.surface)
                        .paddingFromBaseline(top = 40.dp, bottom = 24.dp)
                        .padding(horizontal = 16.dp),
                    text = "Positions",
                    color = MaterialTheme.colors.onSurface,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.subtitle1
                )
            }
            list1Items.forEach {
                item {
                    ListItem1Item(item = it)
                }
            }
            item {
                Box(modifier = Modifier.navigationBarsPadding().fillMaxWidth().height(16.dp).background(MaterialTheme.colors.surface)) {
                    Text("")
                }
            }
        }
    }
}

@Composable
fun Chip(text: String, icon: Boolean = false) {
    OutlinedButton(
        modifier = Modifier.height(40.dp), shape = RoundedCornerShape(50),
        onClick = { },
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.White
        ),
        border = BorderStroke(1.dp, Color.White)
    ) {
        Text(text = text, style = MaterialTheme.typography.body1)
        if (icon) {
            Icon(
                imageVector = Icons.Default.ExpandMore,
                contentDescription = "Expand",
                modifier = Modifier
                    .size(15.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

@Composable
fun ListItem1Item(item: ListItem1) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.surface)
            .padding(horizontal = 16.dp)
            .height(56.dp)
    ) {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colors.onSurface)
                .fillMaxWidth()
                .height(1.dp)
        )
        Image(
            modifier = Modifier
                .align(Alignment.CenterEnd),
            painter = painterResource(id = item.image),
            contentDescription = null,
        )
        Column(
            modifier = Modifier
        ) {
            Text(
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.body1,
                text = item.value,
                modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 0.dp)
            )
            Text(
                style = MaterialTheme.typography.body1,
                text = item.perc + "%",
                modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp),
                color = if (item.perc.startsWith("+")) CustomGreen else CustomRed
            )
        }

        Column(
            modifier = Modifier.padding(start = 80.dp)
        ) {
            Text(
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h3,
                text = item.title,
                modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 0.dp)
            )
            Text(
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.body1,
                text = item.subtitle,
                modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp)
            )
        }
    }
}

data class ListItem1(
    val value: String,
    val perc: String,
    val title: String,
    val subtitle: String,
    @DrawableRes val image: Int,
)

val list1Items = listOf(
    ListItem1(
        "$7,918",
        "-0.54",
        "ALK",
        "Alaska Air Group, Inc.",
        R.drawable.ic_home_alk
    ),
    ListItem1(
        "$1,293",
        "+4.18",
        "BA",
        "Boeing Co.",
        R.drawable.ic_home_ba
    ),
    ListItem1(
        "$893.50",
        "-0.54",
        "DAL",
        "Delta Airlines Inc.",
        R.drawable.ic_home_dal
    ),
    ListItem1(
        "$12,301",
        "+2.51",
        "EXPE",
        "Expedia Group Inc.",
        R.drawable.ic_home_exp
    ),
    ListItem1(
        "$12,301",
        "+1.38",
        "EADSY",
        "Airbus SE",
        R.drawable.ic_home_eadsy
    ),
    ListItem1(
        "$8,521",
        "+1.56",
        "JBLU",
        "Jetblue Airways Corp.",
        R.drawable.ic_home_jblu
    ),
    ListItem1(
        "$521",
        "+2.75",
        "MAR",
        "Marriott International Inc.",
        R.drawable.ic_home_mar
    ),
    ListItem1(
        "$5,481",
        "+0.14",
        "CCL",
        "Carnival Corp",
        R.drawable.ic_home_ccl
    ),
    ListItem1(
        "$9,184",
        "+1.69",
        "RCL",
        "Royal Caribbean Cruises",
        R.drawable.ic_home_rcl
    ),
    ListItem1(
        "$654",
        "+3.23",
        "TRVL",
        "Travelocity Inc.",
        R.drawable.ic_home_trvl
    )
)
