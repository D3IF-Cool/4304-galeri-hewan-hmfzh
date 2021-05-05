package com.d3if0028.galerihewan.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.d3if0028.galerihewan.R
import com.d3if0028.galerihewan.model.Hewan
import com.d3if0028.galerihewan.network.HewanApi
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){
    private val data = MutableLiveData<List<Hewan>>()

    init {
        data.value = initData()
        retrieveData()
    }
    private fun retrieveData() {
        viewModelScope.launch {
            try {
                val result = HewanApi.service.getHewan()
                 Log.d("MainViewModel", "Success: $result")
            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
            }
        }
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