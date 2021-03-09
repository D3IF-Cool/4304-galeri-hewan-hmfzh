package com.d3if0028.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.d3if0028.galerihewan.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyleView){
            addItemDecoration(DividerItemDecoration(context,RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }

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