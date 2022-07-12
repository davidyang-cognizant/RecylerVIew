package com.example.recylerview.data

import com.example.recylerview.R
import com.example.recylerview.model.Affirmation

class Datasource {
    fun loadAffirmation(): List<Affirmation>{
        return listOf(
            Affirmation(R.string.affirmation1, R.string.title1, R.drawable.image1, 5.0),
            Affirmation(R.string.affirmation2, R.string.title2, R.drawable.image2, 4.5),
            Affirmation(R.string.affirmation3, R.string.title3, R.drawable.image3, 4.5),
            Affirmation(R.string.affirmation4, R.string.title4, R.drawable.image4, 3.5),
            Affirmation(R.string.affirmation5, R.string.title5, R.drawable.image5, 4.0),
            Affirmation(R.string.affirmation6, R.string.title6, R.drawable.image6, 3.5),
            Affirmation(R.string.affirmation7, R.string.title7, R.drawable.image7, 5.0),
            Affirmation(R.string.affirmation8, R.string.title8, R.drawable.image8, 4.5),
            Affirmation(R.string.affirmation9, R.string.title9, R.drawable.image9, 5.0),
            Affirmation(R.string.affirmation10, R.string.title10, R.drawable.image10, 3.0)
        )
    }
}