package com.example.recycleview

import com.example.recycleview.models.Pet

class DataSource {
    companion object{
        fun createDataSet(): ArrayList<Pet> {
            val list = ArrayList<Pet>()
            list.add(Pet("Pinky", "Chinchilla", "https://i.ytimg.com/vi/gCRe9YMMYbM/maxresdefault.jpg", "Asta"))
            list.add(Pet("Aras", "Dog", "https://live.staticflickr.com/5559/14381459843_28b23bb6b4_b.jpg", "Asta"))
            list.add(Pet("Mr Minty", "Cat", "https://petsneedit.com/wp-content/uploads/2019/09/cat-ginger-1024x683.jpg", "Anna"))
            list.add(Pet("Jake", "Snake", "https://pbs.twimg.com/media/EK3tjcRXkAE6W7i.jpg", "Geeds"))

            return list
        }
    }
}