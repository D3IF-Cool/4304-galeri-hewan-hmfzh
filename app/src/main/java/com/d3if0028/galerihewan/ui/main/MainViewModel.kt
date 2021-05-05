package com.d3if0028.galerihewan.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.d3if0028.galerihewan.R
import com.d3if0028.galerihewan.model.Hewan

class MainViewModel : ViewModel(){
    private val data = MutableLiveData<List<Hewan>>()

    init {
        data.value = initData()
    }

    private fun initData(): List<Hewan> {
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

    fun getData(): LiveData<List<Hewan>> = data
}