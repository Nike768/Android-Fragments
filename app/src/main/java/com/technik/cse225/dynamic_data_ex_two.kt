package com.technik.cse225

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [dynamic_data_ex_two.newInstance] factory method to
 * create an instance of this fragment.
 */
class dynamic_data_ex_two : Fragment() {
    lateinit var txtData: TextView
    var msg: String = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_dynamic_data_ex_two, container, false)
        txtData = v.findViewById(R.id.textView)
        txtData.setText(msg)
        return  v

    }
    fun displayReceivedData(message: String) {
        msg = message
    }
}