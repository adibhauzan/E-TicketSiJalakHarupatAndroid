package com.example.sijalakharupat.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.sijalakharupat.R
import com.example.sijalakharupat.helper.SharedPref
import kotlinx.android.synthetic.main.fragment_akun.*


/**
 * A simple [Fragment] subclass.
 */

class AkunFragment : Fragment() {

    lateinit var  s:SharedPref
    lateinit var btnLogout:TextView
    lateinit var TvName:TextView
    lateinit var TvEmail:TextView
    lateinit var TvNik:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_akun, container,false)
        init(view)
        
            s = SharedPref(requireActivity())

        btnLogout.setOnClickListener {
            s.setStatusLogin(false)
        }

            setData()
            return view
    }

    fun setData(){

        TvName.text = s.getString(s.name)
        TvEmail.text = s.getString(s.email)
        TvNik.text = s.getString(s.nik)
    }

    private fun init(view: View) {
        btnLogout = view.findViewById(R.id.btn_logout)
        TvName = view.findViewById(R.id.tv_name)
        TvEmail = view.findViewById(R.id.tv_email)
        TvNik = view.findViewById(R.id.tv_nik)
    }

}

