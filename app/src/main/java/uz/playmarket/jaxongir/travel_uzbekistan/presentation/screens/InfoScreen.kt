package uz.playmarket.jaxongir.travel_uzbekistan.presentation.screens

import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.playmarket.jaxongir.travel_uzbekistan.R
import uz.playmarket.jaxongir.travel_uzbekistan.databinding.ScreenInfoBinding

class InfoScreen : Fragment(R.layout.screen_info) {
    private lateinit var binding: ScreenInfoBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = ScreenInfoBinding.bind(view)
        binding.description.justificationMode = JUSTIFICATION_MODE_INTER_WORD

        binding.backMenu.setOnClickListener {
            findNavController().popBackStack()
        }

    }


    override fun onDestroy() {
        super.onDestroy()
//        binding = null
    }
}