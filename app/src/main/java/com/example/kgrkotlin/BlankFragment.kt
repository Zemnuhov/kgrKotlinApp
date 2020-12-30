package com.example.kgrkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class BlankFragment : Fragment() {

    var textView:TextView?=null
    var param:Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view:View=inflater.inflate(R.layout.fragment_blank, container, false)
        textView=view.findViewById(R.id.textId)
        textView?.setText(param.toString())
        return view
    }

    companion object {
        fun newInstance(param: Int): BlankFragment {
            val fragment = BlankFragment()
            fragment.param=param
            return fragment
        }
    }
}