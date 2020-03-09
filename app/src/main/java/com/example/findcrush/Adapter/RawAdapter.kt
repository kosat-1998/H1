package com.example.findcrush.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.findcrush.R
import com.example.findcrush.model.Raw
import kotlinx.android.synthetic.main.item_material.view.*

class RawAdapter(var rawlist : ArrayList<Raw>) : RecyclerView.Adapter<RawAdapter.RawViewHolder>() {



    inner class RawViewHolder (var view: View): RecyclerView.ViewHolder(view){


        fun bindRaw (raw : Raw){


            view.profileImage.setImageResource(raw.profileImage)
            view.name.text = raw.name
            view.hour.text = raw.hour
            view.postImage.setImageResource(raw.postimage)
            view.likeNo.text = raw.like
            view.commentNo.text = raw.comment
            view.shareNo.text = raw.share


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RawViewHolder {

        var myview = LayoutInflater.from(parent.context).inflate(R.layout.item_material,parent,false)

        return RawViewHolder(myview)

    }

    override fun getItemCount(): Int {

        return rawlist.size
    }

    override fun onBindViewHolder(holder: RawViewHolder, position: Int) {

        holder.bindRaw(rawlist.get(position))
    }

}