package com.example.booksappkotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = mutableListOf<Books>()
    lateinit var recyclerView: RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BooksAdapter(list)
    }

    fun onButtinClick(v: View?) {
        val book_name = findViewById<View>(R.id.editName) as EditText
        val book_author = findViewById<View>(R.id.editAuthor) as EditText
        val book_year = findViewById<View>(R.id.editYear) as EditText
        val book_genre = findViewById<View>(R.id.editGenre) as EditText
        list.add(
            Books(
                book_name.text.toString(),
                book_author.text.toString(),
                book_year.text.toString().toInt(),
                book_genre.text.toString()
            )
        )
        recyclerView.adapter?.notifyDataSetChanged();
    }
}