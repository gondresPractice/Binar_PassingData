package com.projectpertama.passing_data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var tvName : TextView
    private lateinit var tvEmail : TextView
    private lateinit var tvAddress : TextView
    private lateinit var tvAge : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        tvName = findViewById(R.id.tvName)
        tvEmail = findViewById(R.id.tvEmail)
        tvAddress = findViewById(R.id.tvAddress)
        tvAge = findViewById(R.id.tvAge)

//        getSerializeableData()
        getParcelableData()
    }

    private fun getParcelableData() {
        val person2 = intent.getParcelableExtra<PersonParcelabe>("person_two") as PersonParcelabe
        tvName.setText("Nama anda adalah : " + person2.name)
        tvEmail.setText("Email anda adalah : "+ person2.email)
        tvAddress.setText("Alamat anda adalah : " + person2.address)
        tvAge.setText("Umur anda adalah : "+ person2.age.toString())

    }

    private fun getSerializeableData() {
        val person = intent.getSerializableExtra("person") as Person
        tvName.setText("Nama anda adalah : " + person.name)
        tvEmail.setText("Email anda adalah : "+ person.email)
        tvAddress.setText("Alamat anda adalah : " + person.address)
        tvAge.setText("Umur anda adalah : " + person.age.toString())
    }
}