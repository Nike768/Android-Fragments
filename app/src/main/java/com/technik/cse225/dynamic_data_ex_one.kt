package com.technik.cse225

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class dynamic_data_ex_one : Fragment() {
    lateinit var edtText: EditText
    lateinit var msg:String
    lateinit var comm:OnDataListener

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val v: View = inflater.inflate(R.layout.fragment_dynamic_data_ex_one, container, false)
        edtText = v.findViewById(R.id.edtTxt)


        edtText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable) {
                comm.communicate(edtText.text.toString())
            }
        })
        return  v
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        comm = context as OnDataListener
    }
}