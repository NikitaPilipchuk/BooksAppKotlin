package com.example.booksappkotlin

open class Books{

    var name: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var author: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var year: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var genre: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(name: String, author: String, year: Int, genre: String) {
        this.name = name
        this.author = author
        this.year = year
        this.genre = genre
    }
}