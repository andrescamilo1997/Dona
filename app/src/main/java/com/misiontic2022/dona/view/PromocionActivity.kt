package com.misiontic2022.dona

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import com.google.firebase.database.DatabaseReference
import com.misiontic2022.dona.adapter.PromocionAdapter
import com.misiontic2022.dona.model.PromocionData
import kotlinx.android.synthetic.main.activity_promocion_act.*


class PromocionActivity : AppCompatActivity() {
    lateinit var mDataBase: DatabaseReference
    private lateinit var promocList:ArrayList<PromocionData>
    private  lateinit var mAdapter:PromocionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promocion_act)

        /**inicializar**/
        promocList = ArrayList()
        mAdapter = PromocionAdapter(this, promocList)

        recyclerPromo.layoutManager = LinearLayoutManager(this)
        recyclerPromo.setHasFixedSize(true)

        //recyclerPromo.adapter = mAdapter

        getPromocionData()


    }

    private fun getPromocionData() {
        mDataBase = FirebaseDatabase.getInstance().getReference("Promociones")
        mDataBase.addValueEventListener(object :ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for (promoSnapshot in snapshot.children){
                        val promocion = promoSnapshot.getValue(PromocionData::class.java)
                        promocList.add(promocion!!)
                    }
                    recyclerPromo.adapter = mAdapter
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@PromocionActivity, error.message, Toast.LENGTH_SHORT).show()

            }

        })

    }
}