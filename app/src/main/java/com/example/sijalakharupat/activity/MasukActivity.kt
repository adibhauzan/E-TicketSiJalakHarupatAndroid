package com.example.sijalakharupat.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sijalakharupat.R
import com.example.sijalakharupat.helper.SharedPref
import kotlinx.android.synthetic.main.activity_masuk.*

class MasukActivity: AppCompatActivity() {

    lateinit var s:SharedPref

    override fun onCreate(savedInstaceState: Bundle?) {
        super.onCreate(savedInstaceState)
        setContentView(R.layout.activity_masuk)

        s = SharedPref(this)

        mainButton()

    }

    private fun mainButton() {

        btn_proseslogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))

        }

        btn_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}