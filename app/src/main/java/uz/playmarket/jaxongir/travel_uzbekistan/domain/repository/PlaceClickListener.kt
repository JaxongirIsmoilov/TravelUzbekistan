package uz.playmarket.jaxongir.travel_uzbekistan.domain.repository

import uz.playmarket.jaxongir.travel_uzbekistan.data.PlaceData

interface PlaceClickListener {
    fun onClick(placeData: PlaceData)
}