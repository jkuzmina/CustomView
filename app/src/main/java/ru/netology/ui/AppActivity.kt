package ru.netology.customview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.customview.R
import ru.netology.customview.dto.Data

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<StatsView>(R.id.stats).data = Data(
            listOf(
                500F,
                500F,
                500F
            ),
            2000F
        )
    }
}