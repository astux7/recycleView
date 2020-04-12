package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recycleview.models.Pet
import kotlinx.android.synthetic.main.layout_pet_list_item.view.*

class PetRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // declare data set using here
    private var items: List<Pet> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // each of individual holder of view
        return PetViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_pet_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       when(holder) {
           is PetViewHolder -> {
               holder.bind(items.get(position))
           }
       }
    }

    fun submitList(petList: List<Pet>){
        items = petList
    }

    class PetViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        val petImage: ImageView = itemView.pet_image
        val petName: TextView = itemView.pet_name
        val petOwner: TextView = itemView.pet_owner

        fun bind(pet: Pet) {
            petName.setText(pet.name)
            petOwner.setText(pet.owner)

            // glide set images
            val requestOption = RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context).load(pet.image).into(petImage)
        }
    }

}