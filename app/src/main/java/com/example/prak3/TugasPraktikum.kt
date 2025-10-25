package com.example.prak3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasPraktikum(modifier: Modifier) {
    Column(
        modifier = Modifier
            .padding(top = 50.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val foto = painterResource(id = R.drawable.profil)

        // Foto profil bulat di tengah
        Image(
            painter = foto,
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(165.dp)
                .clip(CircleShape)


        )
        Spacer(modifier = Modifier.height(17.dp))

        // Deretan ikon media sosial di bawah foto
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val iconSize = 30.dp

            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "Instagram",
                modifier = Modifier.size(iconSize)
            )
            Image(
                painter = painterResource(id = R.drawable.linkedin),
                contentDescription = "Linkedln",
                modifier = Modifier.size(iconSize)
            )
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Facebook",
                modifier = Modifier.size(iconSize)
            )
            Image(
                painter = painterResource(id = R.drawable.github2),
                contentDescription = "Facebook",
                modifier = Modifier.size(iconSize)
            )
        }

        Spacer(modifier = Modifier.height(17.dp))

        Text(
            text = stringResource(id = R.string.nama),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(height = 7.dp))
        Text(
            text = stringResource(id = R.string.ig),
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(height = 11.dp))
        Text(
            text = stringResource(id = R.string.deskripsi),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(height = 22.dp))


}
