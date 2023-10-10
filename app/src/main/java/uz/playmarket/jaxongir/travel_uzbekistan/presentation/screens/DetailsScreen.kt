package uz.playmarket.jaxongir.travel_uzbekistan.presentation.screens

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import uz.playmarket.jaxongir.travel_uzbekistan.R
import uz.playmarket.jaxongir.travel_uzbekistan.data.PlaceData
import uz.playmarket.jaxongir.travel_uzbekistan.data.placeList
import uz.playmarket.jaxongir.travel_uzbekistan.databinding.ScreenDetailsBinding

class DetailsScreen : Fragment(R.layout.screen_details) {
    private lateinit var binding: ScreenDetailsBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        binding = ScreenDetailsBinding.bind(view)
        val data: DetailsScreenArgs by navArgs()
        val place = data.placeData.id?.let { getBookFromId(it) }
        if (place != null) {
            binding.cover.setImageResource(place.coverPhoto)
            binding.title.text = place.title
            binding.description.text = place.description
        }

        binding.backBtn.setOnClickListener {
            Log.d("TTT", "onCreate: backBtn")
            findNavController().popBackStack()
        }
    }

    override fun onDetach() {
        super.onDetach()
        requireActivity().window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
    }

    private fun getBookFromId(bookId: Int): PlaceData? {
        for (place in placeList) {
            if (place.id == bookId) {
                return place
            }
        }
        return null
    }
}