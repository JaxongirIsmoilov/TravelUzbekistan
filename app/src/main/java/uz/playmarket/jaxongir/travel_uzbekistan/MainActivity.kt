package uz.playmarket.jaxongir.travel_uzbekistan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View

class MainActivity : AppCompatActivity(R.layout.activity_main){


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        val decorView = window.decorView
        val uiOptions = (
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                )
        decorView.systemUiVisibility = uiOptions
    }
}