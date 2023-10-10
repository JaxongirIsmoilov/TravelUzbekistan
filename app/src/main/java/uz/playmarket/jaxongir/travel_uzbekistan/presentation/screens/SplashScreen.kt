package uz.playmarket.jaxongir.travel_uzbekistan.presentation.screens

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.playmarket.jaxongir.travel_uzbekistan.R
import uz.playmarket.jaxongir.travel_uzbekistan.databinding.ScreenSplashBinding

@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment(R.layout.screen_splash) {
    private lateinit var binding: ScreenSplashBinding
    private lateinit var topAnimation: Animation
    private lateinit var middleAnimation: Animation
    private lateinit var bottomAnimation: Animation

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ScreenSplashBinding.bind(view) // Bind the layout to the binding object

        val splashTimeOut = 4000
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_mainScreen)
        }, splashTimeOut.toLong())

        topAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.top_animation)
        middleAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.middle_animation)
        bottomAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.bottom_animation)

        binding.topTv.startAnimation(topAnimation)
        binding.middleTv.startAnimation(middleAnimation)
        binding.bottomTv.startAnimation(bottomAnimation)
    }
}