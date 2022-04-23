package com.example.responsi1759

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<ProdukAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        layoutManager= LinearLayoutManager(this)

        var rvProduk:RecyclerView= findViewById(R.id.rv_dthtl)

        rvProduk.layoutManager = layoutManager

        adapter=ProdukAdapter()
        rvProduk.adapter = adapter
    }
}