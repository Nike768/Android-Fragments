package com.technik.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Dynamic_Fragment_orient_example : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment_orient_example)

        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction:FragmentTransaction = fm.beginTransaction()
        val displayMode = resources.configuration.orientation
        if(displayMode == 1)
        {
            val f1 = Dynamic_frag_exam_one()
            fragmentTransaction.replace(android.R.id.content,f1)
        }
        else
        {
            val f2 = fragment_dynamic_exam_two()
            fragmentTransaction.replace(android.R.id.content,f2)
        }
        fragmentTransaction.commit()
    }
}