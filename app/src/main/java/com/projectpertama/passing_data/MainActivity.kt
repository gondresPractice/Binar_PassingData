package com.projectpertama.passing_data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername : EditText
    private lateinit var etAddress : EditText
    private lateinit var etEmail : EditText
    private lateinit var etAge : EditText
    private lateinit var btn : Button
    private lateinit var btnSerialize : Button
    private lateinit var btnParcelable : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()



        val intent = Intent(this,SecondActivity::class.java)



        btn.setOnClickListener {

          passingDataIntent()

            Toast.makeText(applicationContext,etUsername.text.toString(),Toast.LENGTH_LONG).show()

        }

        btnParcelable.setOnClickListener{
            passingDataWithParcelable()
        }

        btnSerialize.setOnClickListener{
            passingDataWithSerializable()
        }
    }

    //Method for Passing Data Intent
    private fun passingDataIntent(){
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("name_key",etUsername.text)
        intent.putExtra("address_key",etAddress.text)
        intent.putExtra("email_key",etEmail.text)
        intent.putExtra("email_key",etAge.text)

        startActivity(intent)
    }

    //Method for Passing Data Serializable
    private fun passingDataWithSerializable(){
        val intent = Intent(this,SecondActivity::class.java)
        val person = Person(etUsername.text.toString(),etEmail.text.toString(),etAddress.text.toString(),Integer.parseInt(etAge.text.toString()))
        intent.putExtra("person",person)
        startActivity(intent)
    }


    //Method for Passing Data Parcelable
    private fun passingDataWithParcelable(){
        val intent = Intent(this,SecondActivity::class.java)
        val person2 = PersonParcelabe(etUsername.text.toString(),etEmail.text.toString(),etAddress.text.toString(),Integer.parseInt(etAge.text.toString()))
        intent.putExtra("person_two",person2)
        startActivity(intent)
    }

    private fun initialize() {
        etUsername = findViewById(R.id.etName)
        etAddress = findViewById(R.id.etAddress)
        etEmail = findViewById(R.id.etEmail)
        etAge = findViewById(R.id.etAge)
        btn = findViewById(R.id.btnPassingData)
        btnSerialize = findViewById(R.id.btnSerializable)
        btnParcelable = findViewById(R.id.btnParcelable)

    }

}