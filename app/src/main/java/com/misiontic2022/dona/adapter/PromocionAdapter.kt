package com.misiontic2022.dona.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.misiontic2022.dona.PromocionActivity
import com.misiontic2022.dona.R
import com.misiontic2022.dona.databinding.ItemListBinding
import com.misiontic2022.dona.model.PromocionData

class PromocionAdapter(
    var c:Context, var promoList:ArrayList<PromocionData>
    ):RecyclerView.Adapter<PromocionAdapter.PromocionViewHolder>() {

    inner class PromocionViewHolder(var v:ItemListBinding):RecyclerView.ViewHolder(v.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromocionViewHolder {
        val inflter = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ItemListBinding>(
            inflter, R.layout.item_list, parent,
        false)
        return PromocionViewHolder(v)
    }

    override fun onBindViewHolder(holder: PromocionViewHolder, position: Int) {
        val newList = promoList[position]
        holder.v.isPromocion = promoList[position]
        holder.v.root.setOnClickListener{

            val img = newList.img
            val promo = newList.promo
            val info = newList.info

            /*** set Data ***/

            val mIntent = Intent(c, PromocionActivity::class.java)

            mIntent.putExtra("img", img)
            mIntent.putExtra("info", info)
            mIntent.putExtra("promo", promo)

            c.startActivity(mIntent)


        }
    }

    override fun getItemCount(): Int {
        return promoList.size
    }
}