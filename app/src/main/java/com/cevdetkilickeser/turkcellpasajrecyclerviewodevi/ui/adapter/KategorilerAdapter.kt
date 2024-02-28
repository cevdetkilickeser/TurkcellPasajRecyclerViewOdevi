package com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Kategoriler
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.databinding.CardKategorilerBinding

class KategorilerAdapter(var mContext: Context, var kategorilerListesi: List<Kategoriler>)
    : RecyclerView.Adapter<KategorilerAdapter.CardKategorilerTutucu>() {
    class CardKategorilerTutucu(var tasarim:CardKategorilerBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardKategorilerTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardKategorilerBinding.inflate(layoutInflater,parent,false)
        return CardKategorilerTutucu(binding)
    }

    override fun getItemCount(): Int {
        return kategorilerListesi.size
    }

    override fun onBindViewHolder(holder: CardKategorilerTutucu, position: Int) {
        val kategori = kategorilerListesi.get(position)
        val t = holder.tasarim

        t.imageViewKategori.setImageResource(
            mContext.resources.getIdentifier(kategori.kategori_resim,"drawable",mContext.packageName)
        )

        t.textViewKategori.text = kategori.kategori_isim
    }
}