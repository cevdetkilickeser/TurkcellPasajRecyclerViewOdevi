package com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Firsatlar
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Kampanyalar
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.data.entity.Kategoriler
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.databinding.FragmentAnasayfaBinding
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter.FirsatlarAdapter
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter.KampanyalarAdapter
import com.cevdetkilickeser.turkcellpasajrecyclerviewodevi.ui.adapter.KategorilerAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val kampanyalarListesi = ArrayList<Kampanyalar>()
        val kategorilerListesi = ArrayList<Kategoriler>()
        val firsatlarListesi = ArrayList<Firsatlar>()

        createData(kampanyalarListesi,kategorilerListesi,firsatlarListesi)

        val kampanyalarAdapter = KampanyalarAdapter(requireContext(),kampanyalarListesi)
        binding.viewPager.adapter = kampanyalarAdapter
        binding.dotsIndicator.attachTo(binding.viewPager)

        val kategorilerAdapter = KategorilerAdapter(requireContext(),kategorilerListesi)
        binding.kategorilerRV.adapter = kategorilerAdapter
        binding.kategorilerRV.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val firsatlarAdapter = FirsatlarAdapter(requireContext(),firsatlarListesi)
        binding.firsatlarRV.adapter = firsatlarAdapter
        binding.firsatlarRV.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)



        return binding.root
    }

    fun createData(kampanyalarListesi : ArrayList<Kampanyalar>, kategorilerListesi : ArrayList<Kategoriler>, firsatlarListesi : ArrayList<Firsatlar>){

        val kampanya1 = Kampanyalar(1,"asus")
        val kampanya2 = Kampanyalar(1,"cardfinans")
        val kampanya3 = Kampanyalar(1,"cevir")
        val kampanya4 = Kampanyalar(1,"duracell")
        val kampanya5 = Kampanyalar(1,"enpara")
        val kampanya6 = Kampanyalar(1,"fibabanka")
        val kampanya7 = Kampanyalar(1,"gap")
        val kampanya8 = Kampanyalar(1,"hangikredi")
        val kampanya9 = Kampanyalar(1,"herschel")
        val kampanya10 = Kampanyalar(1,"huawei")
        val kampanya11 = Kampanyalar(1,"iphone")
        val kampanya12 = Kampanyalar(1,"iphone2")
        val kampanya13 = Kampanyalar(1,"maximum")
        val kampanya14 = Kampanyalar(1,"yenilenmis")

        kampanyalarListesi.add(kampanya1)
        kampanyalarListesi.add(kampanya2)
        kampanyalarListesi.add(kampanya3)
        kampanyalarListesi.add(kampanya4)
        kampanyalarListesi.add(kampanya5)
        kampanyalarListesi.add(kampanya6)
        kampanyalarListesi.add(kampanya7)
        kampanyalarListesi.add(kampanya8)
        kampanyalarListesi.add(kampanya9)
        kampanyalarListesi.add(kampanya10)
        kampanyalarListesi.add(kampanya11)
        kampanyalarListesi.add(kampanya12)
        kampanyalarListesi.add(kampanya13)
        kampanyalarListesi.add(kampanya14)

        val kategori1 = Kategoriler(1,"100 TL Altı Ürünler","bintlaltiurunler")
        val kategori2 = Kategoriler(2,"Fırsatlar Kapısı","firsatlarkapisi")
        val kategori3 = Kategoriler(3,"Akıllı Telefonlar","akillitelefonlar")
        val kategori4 = Kategoriler(4,"Bilgisayar ve Tabletler","bilgisayarvetabletler")
        val kategori5 = Kategoriler(5,"Televizyon","televizyon")
        val kategori6 = Kategoriler(6,"Elektrikli Ev Aletleri","elektriklievaletleri")
        val kategori7 = Kategoriler(7,"Aksesuar Ürünleri","aksesuarurunleri")
        val kategori8 = Kategoriler(8,"Eski Telefonunu Sat","eskitelefonunusat")
        val kategori9 = Kategoriler(9,"Pasaj Gamer","pasajgamer")
        val kategori10 = Kategoriler(10,"Hobi & Oyun","hobioyun")
        val kategori11 = Kategoriler(11,"Anne & Bebek & Çocuk","annebebekcocuk")
        val kategori12 = Kategoriler(12,"Beyaz Eşya","beyazesya")
        val kategori13 = Kategoriler(13,"Pet Shop","petshop")

        kategorilerListesi.add(kategori1)
        kategorilerListesi.add(kategori2)
        kategorilerListesi.add(kategori3)
        kategorilerListesi.add(kategori4)
        kategorilerListesi.add(kategori5)
        kategorilerListesi.add(kategori6)
        kategorilerListesi.add(kategori7)
        kategorilerListesi.add(kategori8)
        kategorilerListesi.add(kategori9)
        kategorilerListesi.add(kategori10)
        kategorilerListesi.add(kategori11)
        kategorilerListesi.add(kategori12)
        kategorilerListesi.add(kategori13)

        val firsat1 = Firsatlar(1,"Sinbo SCM-2954 Elektrikli Cezve","sinbo",229,true,70)
        val firsat2 = Firsatlar(2,"Baymak BT 7000 Banyo Tipi Elektrikli Şofben","baymakbt7000",1668,true,100)
        val firsat3 = Firsatlar(3,"Neutron Smart Bulb Lite Akıllı Led Ampul","neutronsmartbulbliteakilliledampul",269,false,0)
        val firsat4 = Firsatlar(4,"Yasomi Ysm X-Speed Spipnning Bike","yasomiysmxsped",6699,true,200)
        val firsat5 = Firsatlar(5,"Jlab Go air Wireles Earbuds","jlabgoair",449,true,30)
        val firsat6 = Firsatlar(6,"Milk&Moo Çocuk Sırt Çantası Jungle riends","milkmoojunglefr",449,true,50)
        val firsat7 = Firsatlar(7,"LG DFC512FW 9 Programlı Bulaşık Makinesi","lgdfcbulasik",20999,true,300)
        val firsat8 = Firsatlar(8,"Yasomi Ysm X-Fit Bench","yasomiysmxfit",3899,false,0)
        val firsat9 = Firsatlar(9,"Apple AirPods Pro 2.Nesil MagSafe ŞarjKutusu","airpodspro2sarj",7849,false,0)
        val firsat10 = Firsatlar(10,"Victorinox6.7111.3 Soyma Bıçak Seti","victorinox",614,true,85)

        firsatlarListesi.add(firsat1)
        firsatlarListesi.add(firsat2)
        firsatlarListesi.add(firsat3)
        firsatlarListesi.add(firsat4)
        firsatlarListesi.add(firsat5)
        firsatlarListesi.add(firsat6)
        firsatlarListesi.add(firsat7)
        firsatlarListesi.add(firsat8)
        firsatlarListesi.add(firsat9)
        firsatlarListesi.add(firsat10)

    }

}