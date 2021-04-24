package com.aait.customtagsadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.aait.customtagsadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myItems = ArrayList<MyItem>()
    private val mapper = MyItemMapper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        for (i in 0 until names.size){
            myItems.add(MyItem((i+1), names[i]))
        }

        binding.rv.apply {
            adapter = TagAdapter(mapper.mapFromEntityList(myItems), Selection.NON_SELECTABLE)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private val names: MutableList<String>
        get() {
            return mutableListOf(
                 "Exercise",
                 "Be Cool",
                 "Floss",
                 "Read the Sign",
                 "Meditation",
                 "Be Cool in an awesome way",
                 "Go Crazy",
                 "Drink Water",
                 "Tag Team",
                 "No Alcohol",
                 "Code like Crazy",
                 "Zombies?",
                 "Zero Life",
                 "Just Don't do it",
                 "Drunk in Funeral",
                 "Listen to Opeth",
                 "Small",
                 "Not so Small",
                 "Java",
                 "Did anyone said Zombies?",
                 "Android",
                 "Proud looser :D",
                 "Tale of two taggies",
                 "No Pain no Tag",
                 "Code for Food",
                 "Bar Blatta",
                 "No Burgers!",
                 "Play Guitar",
                 "Clap the Article",
                 "Walk",
                 "Medium is Awesome",
                 "Kotlin",
                 "Dream",
                 "Freedom",
                 "Less Sugar",
                 "The longer the Tag the longer the Cell",
                 "Discipline",
                 "No to Drugs :D",
                 "Avengers",
                 "Run for your Life",
                 "Margarita",
                 "Candies",
                 "C")
        }
}