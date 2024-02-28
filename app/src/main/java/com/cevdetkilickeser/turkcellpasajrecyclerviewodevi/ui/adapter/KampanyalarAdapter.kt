package com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Kampanyalar
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.databinding.CardKampanyalarBinding

class KampanyalarAdapter(var mContext: Context, var kampanyalarListesi: List<Kampanyalar>)
    : RecyclerView.Adapter<KampanyalarAdapter.CardKampanyalarTutucu>() {
    inner class CardKampanyalarTutucu(var tasarim:CardKampanyalarBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardKampanyalarTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardKampanyalarBinding.inflate(layoutInflater,parent,false)
        return CardKampanyalarTutucu(binding)
    }

    override fun getItemCount(): Int {
        return kampanyalarListesi.size
    }

    override fun onBindViewHolder(holder: CardKampanyalarTutucu, position: Int) {
        val kampanya = kampanyalarListesi.get(position)
        val t = holder.tasarim

        t.imageViewKampanya.setImageResource(
            mContext.resources.getIdentifier(kampanya.kampanya_resim,"drawable",mContext.packageName)
        )

    }
}