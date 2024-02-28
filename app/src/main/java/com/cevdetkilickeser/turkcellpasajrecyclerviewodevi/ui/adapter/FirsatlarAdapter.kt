package com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Firsatlar
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.databinding.CardFirsatlarBinding

class FirsatlarAdapter(var mContext: Context, var firsatlarListesi: List<Firsatlar>)
    : RecyclerView.Adapter<FirsatlarAdapter.CardFirsatlarTutucu>() {
    inner class CardFirsatlarTutucu(var tasarim: CardFirsatlarBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardFirsatlarTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardFirsatlarBinding.inflate(layoutInflater,parent,false)
        return CardFirsatlarTutucu(binding)
    }

    override fun getItemCount(): Int {
        return firsatlarListesi.size
    }

    override fun onBindViewHolder(holder: CardFirsatlarTutucu, position: Int) {
        val firsat = firsatlarListesi.get(position)
        val t = holder.tasarim

        t.ImageViewFirsatResim.setImageResource(
            mContext.resources.getIdentifier(firsat.firsat_resim,"drawable",mContext.packageName)
        )

        t.textViewFirsatIsim.text = firsat.firsat_isim
        t.textViewFirsatFiyat.text = "${firsat.firsat_fiyat - firsat.firsat_indirim_miktar}"
        t.textViewIndirim.text = "${firsat.firsat_indirim_miktar} TL İndirim"
        t.textViewFiyat.text = firsat.firsat_fiyat.toString()

        if (firsat.firsat_indirim_varmi){
            t.cardViewIndirim.visibility = View.VISIBLE
            t.textViewFiyat.visibility = View.VISIBLE
            t.textViewTL.visibility = View.VISIBLE
            t.viewFiyat.visibility = View.VISIBLE
        }
    }
}