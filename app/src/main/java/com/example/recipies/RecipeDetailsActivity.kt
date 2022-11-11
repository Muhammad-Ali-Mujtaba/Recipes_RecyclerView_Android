package com.example.recipies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RecipeDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_details)

        val food = intent.getParcelableExtra<Food>("food")

        if(food!=null){
            val recipeImage: ImageView = findViewById(R.id.recipeDetailsImage)
            val recipeText: TextView = findViewById(R.id.recipeDetailsText)

            recipeImage.setImageResource(food.image)
            recipeText.text = food.recipe
        }


    }
}