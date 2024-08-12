package com.example.familyphotos

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var currentImage = 0
    lateinit var image: ImageView
    var members = arrayOf("Puppalwar Family","Papa ","Mom","Apeksha","Nikhil")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val next =findViewById<ImageButton>(R.id.btnnext)
        val previ=findViewById<ImageButton>(R.id.btnprevious)
val textMembers=findViewById<TextView>(R.id.textView3)

        next.setOnClickListener{
            var idCurrentImageString = "pic$currentImage"
            var idcurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image =findViewById(idcurrentImageInt)
            image.alpha = 0f

            currentImage = (5+currentImage+1)%5
            var idImageToShowstring =  "pic$currentImage"
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowstring,"id",packageName)
            image =findViewById(idImageToShowInt)
            image.alpha = 1f

            textMembers.text=members[currentImage]

        }
        previ.setOnClickListener {
            var idCurrentImageString = "pic$currentImage"
            var idcurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image =findViewById(idcurrentImageInt)
            image.alpha = 0f

            currentImage = (5+currentImage-1)%5
            var idImageToShowstring =  "pic$currentImage"
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowstring,"id",packageName)
            image =findViewById(idImageToShowInt)
            image.alpha = 1f
            textMembers.text=members[currentImage]
        }

    }
}