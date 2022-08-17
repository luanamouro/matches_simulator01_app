package me.dio.simulator01.R00.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulator01.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    object Extras{
        const val MATCH = "EXTRA_MATCH"
    }

    private lateinit var binding: ActivityDetailBinding
    @SuppressLint("UseSupportActionBar")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}