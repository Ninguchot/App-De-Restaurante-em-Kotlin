package com.example.appderestaurante_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appderestaurante_kotlin.databinding.FoodItemBinding
import com.example.appderestaurante_kotlin.motel.Food

class FoodAdapter(private  val context: Context, private val foodList: MutableList<Food>):
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val listItem = FoodItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return FoodViewHolder(listItem)
    }

    override fun getItemCount() = foodList.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.imgFood.setBackgroundResource(foodList[position].imgFood!!)
        holder.txtFoodName.text = foodList[position].foodName
        holder.txtFoodDescription.text = foodList[position].foodDescription
        holder.txtPrice.text = foodList[position].price
    }
    inner class FoodViewHolder(bindind: FoodItemBinding): RecyclerView.ViewHolder(bindind.root) {
        val imgFood = bindind.imgFood
        val txtFoodName = bindind.txtFoodName
        val txtFoodDescription = bindind.txtFoodDescription
        val txtPrice = bindind.txtPrice


    }
}