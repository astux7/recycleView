package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
// should not be good

class MainActivity : AppCompatActivity() {
    lateinit var petAdapter: PetRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycleView()
        addDadaSet()
    }

    private fun addDadaSet() {
        val data = DataSource.createDataSet()
        petAdapter.submitList(data)
    }

    private fun initRecycleView(){
        // access recycle view update property
        recycle_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            petAdapter = PetRecyclerAdapter()
            adapter = petAdapter
        }
    }
}
