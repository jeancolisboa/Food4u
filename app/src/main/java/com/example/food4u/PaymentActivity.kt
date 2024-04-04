package com.example.food4u

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.food4u.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPaymentBinding //declarando o binding para o escopo global
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPaymentBinding.inflate(layoutInflater) //inflando o binding
        setContentView(binding.root)

        //botoes
        val imageBack = binding.imageBack

        //eventos
        imageBack.setOnClickListener{
            callMainActivity()
        }
    }

    private fun callMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}