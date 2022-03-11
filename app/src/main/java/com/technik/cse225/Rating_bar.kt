package com.technik.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class Rating_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)

       val rating = findViewById<RatingBar>(R.id.rating)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val submit = findViewById<Button>(R.id.button)

       submit.setOnClickListener {
           val totalStars = "Total stars: " + rating.numStars
           val rating = "Rating: " + rating.rating
           Toast.makeText(this,"""$totalStars$rating""".trimIndent(),Toast.LENGTH_LONG).show()
       }

        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this,"rating $rating, $fromUser",Toast.LENGTH_LONG).show()
        }
    }
}