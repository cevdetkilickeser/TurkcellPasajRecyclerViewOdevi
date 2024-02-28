package com.cevdetkilickeser.turkcellpasajrecyclerviewodevi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Firsatlar
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Kampanyalar
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Kategoriler
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.databinding.ActivityMainBinding
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter.FirsatlarAdapter
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter.KampanyalarAdapter
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter.KategorilerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}