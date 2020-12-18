package com.example.booksappkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter(private val values: List<Books>):
    RecyclerView.Adapter<BooksAdapter.MyViewHolder>() {


    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val bookName: Books = values.get(position)

        holder.title_book?.text = bookName.name
        holder.author_book?.text = bookName.author
        holder.year_book?.text = bookName.year.toString()
        holder.genre_book?.text = bookName.genre
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title_book: TextView? = null
        var author_book: TextView? = null
        var year_book: TextView? = null
        var genre_book: TextView? = null

        init {
            title_book = itemView?.findViewById(R.id.title_book)
            author_book = itemView?.findViewById(R.id.author_book)
            year_book = itemView?.findViewById(R.id.year_book)
            genre_book = itemView?.findViewById(R.id.genre_book)
        }
    }




}