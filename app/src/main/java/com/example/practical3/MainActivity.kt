package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practical3.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil as DataBindingUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("ali","123456","ali@gmail.com","No.1 123 Jalan 12")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson

        binding.updateBtn.setOnClickListener(){
            aPerson.email = "xxx@gmail.com"

            binding.apply { invalidateAll() }
        }

        /*
        binding.name.text = aPerson.name
        binding.icnumber.text = aPerson.ic
        binding.email.text = aPerson.email
        binding.address.text = aPerson.address
         */


    }
}