package com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.R
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Kampanyalar
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.databinding.CardKampanyalarBinding
import java.util.Objects

class KampanyalarAdapter(var context: Context, var kampanyalarListesi: List<Kampanyalar>) : PagerAdapter() {


    /*
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

    }*/
    override fun getCount(): Int {
        return kampanyalarListesi.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as RelativeLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // on below line we are initializing
        // our layout inflater.
        val mLayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        // on below line we are inflating our custom
        // layout file which we have created.
        val itemView: View = mLayoutInflater.inflate(R.layout.card_kampanyalar, container, false)

        // on below line we are initializing
        // our image view with the id.
        val imageView: ImageView = itemView.findViewById<View>(R.id.imageViewKampanya) as ImageView

        // on below line we are setting
        // image resource for image view.
        imageView.setImageResource(
            context.resources.getIdentifier(kampanyalarListesi.get(position).kampanya_resim,"drawable",context.packageName)
        )

        // on the below line we are adding this
        // item view to the container.
        Objects.requireNonNull(container).addView(itemView)

        // on below line we are simply
        // returning our item view.
        return itemView
    }

    // on below line we are creating a destroy item method.
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        // on below line we are removing view
        container.removeView(`object` as RelativeLayout)
    }
}