package com.example.recylerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import kotlin.random.Random
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerview.R
import com.example.recylerview.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * Binds a specific view to the passed in view such as text views.
     * Hold only ONE list item view
     */
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val itemHeader: TextView = view.findViewById(R.id.item_header)
        val ratingBar: RatingBar = view.findViewById(R.id.ratingBar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Holds only a reference to the list item view (from which we can later find child views like TextView)
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        /*
        * call getString() with a string resource ID,
        * and it will return the string value associated with it
        * */
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.itemHeader.text = context.resources.getString(item.stringTitleId)
        holder.ratingBar.rating = item.rating.toFloat()
    }

    override fun getItemCount() = dataset.size
}