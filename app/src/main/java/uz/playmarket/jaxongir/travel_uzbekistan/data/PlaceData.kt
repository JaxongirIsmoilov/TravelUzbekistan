package uz.playmarket.jaxongir.travel_uzbekistan.data

import java.io.Serializable

var placeList = mutableListOf<PlaceData>()
data class PlaceData(
    var coverPhoto: Int,
    var title: String,
    var location: String,
    var description: String,
    val id: Int? = placeList.size
) : Serializable