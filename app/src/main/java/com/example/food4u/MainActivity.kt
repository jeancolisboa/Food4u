package com.example.food4u

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food4u.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding //declarando o binding para o escopo global
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //inflando o binding
        setContentView(binding.root)

        // Get the FragmentManager
        val fragmentManager = supportFragmentManager

        // Start a transaction
        val transaction = fragmentManager.beginTransaction()

        // Create an instance of SnackFragment
        val snackFragment = SnackFragment()

        // Replace the contents of the FragmentContainerView with the fragment
        transaction.replace(R.id.fragment_container_snack, snackFragment)

        // Commit the transaction
        transaction.commit()


    }
}