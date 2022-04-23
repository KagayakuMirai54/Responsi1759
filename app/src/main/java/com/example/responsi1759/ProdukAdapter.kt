package com.example.responsi1759

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProdukAdapter:RecyclerView.Adapter<ProdukAdapter.ViewHolder>() {
    private var foto = intArrayOf(R.drawable.semeru, R.drawable.brobudr,R.drawable.tnah_lot_bali)
    private var judul = arrayOf("Taman Nasional Bromo Tengger   Semeru","Candi Borobudur", "Tanah Lot Bali")
    private var penjelasan = arrayOf("Sebelum ditetapkan sebagai taman nasional, daerah Tengger merupakan kawasan hutan yang berfungsi sebagai cagar alam dan hutan wisata.","Borobudur adalah candi Budha terbesar pada masa abad ke-19, memiliki luas kira-kira 123 x 123 meter. Berbentuk seperti piramida dengan tinggi kira-kira 29 meter dan terdiri lebih dari 500 patung Budha dan tersusun lebih dari 2 juta batu.","Tanah Lot merupakan tempat wisata terkenal, hampir setiap wisatawan yang liburan ke Bali menyempatkan diri menikmati objek wisata ini.")

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        var itemFoto:ImageView
        var itemJudul:TextView
        var itemPenjelasan:TextView

        init {
            itemFoto = itemView.findViewById(R.id.item_foto)
            itemJudul = itemView.findViewById(R.id.item_judul)
            itemPenjelasan = itemView.findViewById(R.id.item_deskripsi)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_produk,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemFoto.setImageResource(foto[position])
        holder.itemPenjelasan.text = penjelasan[position]
        holder.itemJudul.text = judul[position]
    }

    override fun getItemCount(): Int {
        return judul.size
    }
}