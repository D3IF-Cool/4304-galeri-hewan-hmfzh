package com.d3if0028.galerihewan.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.d3if0028.galerihewan.model.Hewan
import com.d3if0028.galerihewan.R
import com.d3if0028.galerihewan.databinding.FragmentMainBinding

class MainFragment :Fragment() {
    private lateinit var binding: FragmentMainBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }

    private fun getData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus Olor", R.drawable.angsa,"Jenis: Mamalia"),
            Hewan("Ayam","Gallus gallus", R.drawable.ayam," Jenis: Unggas"),
            Hewan("Bebek","Cairina moschata", R.drawable.bebek,"Jenis: Unggas"),
            Hewan("Domba","Ovis ammon", R.drawable.domba,"Jenis: Mamalia"),
            Hewan("Kalkun","Meleagris gallopavo", R.drawable.kalkun,"Jenis: Unggas"),
            Hewan("Kambing","Capricornis sumatrensis", R.drawable.kambing,"Jenis: Mamalia"),
            Hewan("Kelinci","Oryctolagus cuniculus", R.drawable.kelinci,"Jenis: Mamalia"),
            Hewan("Kerbau","Bubalus bubalis", R.drawable.kerbau,"Jenis: Mamalia"),
            Hewan("Kuda","Equus caballus", R.drawable.kuda,"Jenis: Mamalia"),
            Hewan("Sapi","Bos taurus", R.drawable.sapi,"Jenis: Mamalia"),
        )
    }
}