package com.example.kgrkotlin

import android.bluetooth.le.ScanCallback
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ScanBluetoothFragment: Fragment() {


    companion object{
        fun newInstance():ScanBluetoothFragment {
            val fragment = ScanBluetoothFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.scan_bluetooth_fragment, container, false)
        return view
    }
}