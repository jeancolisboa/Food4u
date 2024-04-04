package com.example.food4u

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentContainerView
import com.example.food4u.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding //declarando o binding para o escopo global
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //inflando o binding
        setContentView(binding.root)

        // declarando o fragmentemanager
        val fragmentManager = supportFragmentManager

        // comecando uma transacao
        val transaction = fragmentManager.beginTransaction()

        // instancia dos fragmentos
        val snackFragment = SnackFragment()

        val drinksFragment = DrinksFragment()

        // substituindo os contents do containerview com os fragmentos
        transaction.replace(R.id.fragment_container_snack, snackFragment)
        transaction.replace(R.id.fragment_container_drinks, drinksFragment)

        // confirmando a transacao
        transaction.commit()

        //chamando a funcao do fragmento inicial desde o inicio
        showSnackFragment()

        //botoes
        val textViewSnack = binding.textSnack
        val textViewDrink = binding.textDrink
        val textViewCombos = binding.textCombos
        val textViewSalads = binding.textSalads
        val textViewChicken = binding.textChicken
        val textViewIceCream = binding.textIceCream
        val imageView = binding.imageBag

        //eventos
        textViewSnack.setOnClickListener {
            showSnackFragment()
        }

        textViewDrink.setOnClickListener {
            showDrinkFragment()
        }

        imageView.setOnClickListener{
            callPayment()
        }

    }

    private fun showDrinkFragment() {
        //chama o fragmento correspondente
        val drinksFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_drinks)
        drinksFragmentContainer.visibility = View.VISIBLE

        //chumba a cor no textview selecionado
        val textViewDrink = binding.textDrink
        textViewDrink.setTextColor(ContextCompat.getColor(this,R.color.orange))

        //chumba a cor nos textview nao selecionados
        val textViewSnack = binding.textSnack
        textViewSnack.setTextColor(ContextCompat.getColor(this,R.color.black))

        //desativa os outros fragmentos nao selecionados
        val snackFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_snack)
        snackFragmentContainer. visibility = View.INVISIBLE
    }

    private fun showSnackFragment() {
        //chama o fragmento correspondente
        val snackFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_snack)
        snackFragmentContainer. visibility = View.VISIBLE

        //chumba a cor no textview selecionado
        val textViewSnack = binding.textSnack
        textViewSnack.setTextColor(ContextCompat.getColor(this,R.color.orange))

        //chumba a cor nos textview nao selecionados
        val textViewDrink = binding.textDrink
        textViewDrink.setTextColor(ContextCompat.getColor(this,R.color.black))

        //desativa os outros fragmentos nao selecionados
        val drinksFragmentContainer = findViewById<FragmentContainerView>(R.id.fragment_container_drinks)
        drinksFragmentContainer.visibility = View.INVISIBLE

        // Atualiza a visibilidade da cesta de compras
        updateShoppingBasketVisibility()
    }

    fun updateShoppingBasketVisibility() {
        //declarando os fragmentos para poder acessar eles
        val snackFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_snack) as? SnackFragment
        val drinksFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_drinks) as? DrinksFragment

        //se um dos fragmentos forem diferentes de nulo
        if (snackFragment != null || drinksFragment != null) {

            //se a funcao isQuantityNotEmpty de um dos fragmentos for verdadeira
            if (snackFragment?.isQuantityNotEmpty() == true || drinksFragment?.isQuantityNotEmpty() == true) {
                //exibe a cesta de compras
                binding.imageShoppingBasket.visibility = View.VISIBLE
            } else {
                //esconde a cesta de compras
                binding.imageShoppingBasket.visibility = View.INVISIBLE
            }
        }
    }

    private fun callPayment() {
        val imageShoppingBasket = findViewById<ImageView>(R.id.image_shopping_basket)

        if(imageShoppingBasket.isVisible) {
            startActivity(Intent(this, PaymentActivity::class.java))
        }
    }

}