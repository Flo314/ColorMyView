package com.example.android.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // auditeurs
        setListeners()
    }

    private fun setListeners() {
        // liste des vues
        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout);
        // définir l'auditeur pour chaque vues
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // boîtes utilisant les couleurs de la classe de couleurs pour le fond
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY);
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY);

            // boîtes utilisant les couleurs des ressources
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light);
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark);
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light);

            else -> view.setBackgroundColor(Color.LTGRAY);
        }
    }
}
