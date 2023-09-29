package com.example.appderestaurante_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appderestaurante_kotlin.adapter.FoodAdapter
import com.example.appderestaurante_kotlin.databinding.ActivityMainBinding
import com.example.appderestaurante_kotlin.databinding.FoodItemBinding
import com.example.appderestaurante_kotlin.motel.Food

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private val foodList: MutableList<Food> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val recyclerViewFood = binding.RecyclerViewFood
        recyclerViewFood.layoutManager = LinearLayoutManager(this)
        recyclerViewFood.setHasFixedSize(true)
        foodAdapter = FoodAdapter(this, foodList)
        recyclerViewFood.adapter = foodAdapter
        getFood()
    }

    private fun getFood(){

        val food1 = Food(
            imgFood = R.drawable.food1,
            foodName = "Best seler food 1",
            foodDescription = "Pedaços de Frango e batata frita",
            price = "$ 60.00"
        )
        foodList.add(food1)

        val food2 = Food(
            imgFood = R.drawable.food2,
            foodName = "Barca completa",
            foodDescription = "Hot roll e etc",
            price = "$ 120.00"
        )
        foodList.add(food2)

        val food3 = Food(
            imgFood = R.drawable.food3,
            foodName = "Mistureba",
            foodDescription = "Custelas com Pizza e camarão",
            price = "$ 300.00"
        )
        foodList.add(food3)

        val food4 = Food(
            imgFood = R.drawable.food4,
            foodName = "Prato da casa branca",
            foodDescription = "Arroz,batata frita e file de frango",
            price = "$ 50.00"
        )
        foodList.add(food4)

        val food5 = Food(
            imgFood = R.drawable.food5,
            foodName = "Macarrão Xique",
            foodDescription = "Macarrão",
            price = "$ 75.00"
        )
        foodList.add(food5)

}
}