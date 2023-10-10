package uz.playmarket.jaxongir.travel_uzbekistan.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.playmarket.jaxongir.travel_uzbekistan.data.PlaceData
import uz.playmarket.jaxongir.travel_uzbekistan.data.placeList
import uz.playmarket.jaxongir.travel_uzbekistan.databinding.CardItemBinding

class ItemAdapter(
    private val ls: List<PlaceData>,
    private val clickListener: (PlaceData) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ItemHolder>() {


    inner class ItemHolder(
        private val binding: CardItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.cardView.setOnClickListener {
                Log.d("TTT", "work")
                clickListener.invoke(ls[adapterPosition])
            }
        }

        fun bind(data: PlaceData) {
            binding.cover.setImageResource(data.coverPhoto)
            binding.title.text = data.title
            binding.location.text = data.location
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder = ItemHolder(
        CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount(): Int = placeList.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(ls[position])
    }
}