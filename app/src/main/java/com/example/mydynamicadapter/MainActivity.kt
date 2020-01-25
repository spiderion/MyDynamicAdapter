package com.example.mydynamicadapter

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var adapter: DynamicAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = DynamicAdapter(

            object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    Toast.makeText(getttttContext(), "hello", Toast.LENGTH_LONG).show()
                }
            }
        )

        recylcer.layoutManager = LinearLayoutManager(this)
        recylcer.adapter = adapter
        adapter?.items?.addAll(
            arrayListOf(
                ItemUser("Chris"),
                ItemUser2("Ion"),
                ItemUser("Gio"),
                ItemUser("Anton")
            )
        )
        adapter?.notifyDataSetChanged()
    }

    fun getttttContext() = this
}
