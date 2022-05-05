package controller

import Services.Dtaservices
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*
import model.Category

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        adapter = ArrayAdapter(this,
        android.R.layout.simple_expandable_list_item_1,
        Dtaservices.catagories)

        categorylistview.adapter = adapter
    }


}