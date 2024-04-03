package com.example.food4u

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentContainerView
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

        val drinksFragment = DrinksFragment()

        // Replace the contents of the FragmentContainerView with the fragment
        transaction.replace(R.id.fragment_container_snack, snackFragment)
        transaction.replace(R.id.fragment_container_drinks, drinksFragment)

        // Commit the transaction
        transaction.commit()

        //definindo o fragmento de lanches visivel desde o oncreate
        val snackFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_snack)
        snackFragmentContainer. visibility = View.VISIBLE

        //botoes
        val textViewSnack = binding.textSnack
        val textViewDrink = binding.textDrink

        //eventos
        textViewSnack.setOnClickListener {
            showSnackFragment()
        }

        textViewDrink.setOnClickListener {
            showDrinkFragment()
        }

    }

    private fun showDrinkFragment() {
        val drinksFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_drinks)
        drinksFragmentContainer.visibility = View.VISIBLE

        val snackFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_snack)
        snackFragmentContainer. visibility = View.INVISIBLE
    }

    private fun showSnackFragment() {
        val snackFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_snack)
        snackFragmentContainer. visibility = View.VISIBLE

        val drinksFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_drinks)
        drinksFragmentContainer.visibility = View.INVISIBLE
    }
}