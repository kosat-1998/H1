package com.example.findcrush

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.findcrush.Adapter.RawAdapter
import com.example.findcrush.model.Raw
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  1 -> load data into the arraylist

        var rawArray = ArrayList<Raw>()


        rawArray.add(Raw(R.drawable.p1,"Robert","1h",R.drawable.r1,"44","22","1"))
        rawArray.add(Raw(R.drawable.p2,"John","4h",R.drawable.r2,"29","12","8"))
        rawArray.add(Raw(R.drawable.p5,"Li","3h",R.drawable.r3,"33","17","23"))
        rawArray.add(Raw(R.drawable.p4,"Harry","9h",R.drawable.r4,"10","39","45"))
        rawArray.add(Raw(R.drawable.p5,"Lin","1h",R.drawable.r5,"44","22","18"))
        rawArray.add(Raw(R.drawable.p6,"John","4h",R.drawable.r6,"29","12","8"))
        rawArray.add(Raw(R.drawable.p7,"Li","3h",R.drawable.r7,"3","17","23"))
        rawArray.add(Raw(R.drawable.p3,"Harry","12h",R.drawable.r8,"90","3","85"))



        //  2 -> assign(equals) with adapter's arraylist

        var productAdapter =  RawAdapter(rawArray)

        // 3 -> create a layoutmanager


        recyclerview.layoutManager =  LinearLayoutManager(this)



        //  4 -> access the recyclerview adapter and load the data into it

        recyclerview.adapter = productAdapter







    }
}
