package com.example.food4u

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class SnackFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout para esse fragmento
        return inflater.inflate(R.layout.fragment_snack, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addQuantity()
    }

    private fun addQuantity() {
        //adicionar quantidade de bacon
        val textBaconPlus = view?.findViewById<TextView>(R.id.text_bacon_plus)
        val textBaconLess = view?.findViewById<TextView>(R.id.text_bacon_less)
        val editQuantityBacon = view?.findViewById<EditText>(R.id.edit_quantity_bacon)

        textBaconLess?.setOnClickListener {
            editQuantityBacon?.clearFocus()
            val currentQuantityString = editQuantityBacon?.text.toString()

            // verifica se o campo de texto não está vazio
            if (currentQuantityString.isNotEmpty()) {
                val currentQuantity = currentQuantityString.toInt()

                // verifica se a quantidade é maior que 1
                if (currentQuantity > 1) {
                    val newQuantity = currentQuantity - 1
                    editQuantityBacon?.setText(newQuantity.toString())
                } else {
                    // se a quantidade for 1 ou menor, limpa o campo de texto
                    editQuantityBacon?.setText("")
                }
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as MainActivity).updateShoppingBasketVisibility()
        }

        textBaconPlus?.setOnClickListener {
            editQuantityBacon?.clearFocus()
            //obtendo o valor do texto atual do editQuantityBacon
            val currentQuantity = editQuantityBacon?.text.toString()

            if(currentQuantity.isEmpty()) {
                editQuantityBacon?.setText("1")
            } else {
                val newQuantity = currentQuantity.toInt() + 1
                editQuantityBacon?.setText(newQuantity.toString())
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as MainActivity).updateShoppingBasketVisibility()
        }

        //adicionar quantidade do egg
        val textEggPlus = view?.findViewById<TextView>(R.id.text_egg_plus)
        val textEggLess = view?.findViewById<TextView>(R.id.text_egg_less)
        val editQuantityEgg = view?.findViewById<EditText>(R.id.edit_quantity_egg)

        textEggLess?.setOnClickListener {
            editQuantityEgg?.clearFocus()
            val currentQuantityString = editQuantityEgg?.text.toString()

            // verifica se o campo de texto não está vazio
            if (currentQuantityString.isNotEmpty()) {
                val currentQuantity = currentQuantityString.toInt()

                // verifica se a quantidade é maior que 1
                if (currentQuantity > 1) {
                    val newQuantity = currentQuantity - 1
                    editQuantityEgg?.setText(newQuantity.toString())
                } else {
                    // se a quantidade for 1 ou menor, limpa o campo de texto
                    editQuantityEgg?.setText("")
                }
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as MainActivity).updateShoppingBasketVisibility()
        }

        textEggPlus?.setOnClickListener {
            editQuantityEgg?.clearFocus()
            //obtendo o valor do texto atual do editQuantityEgg
            val currentQuantity = editQuantityEgg?.text.toString()

            if(currentQuantity.isEmpty()) {
                editQuantityEgg?.setText("1")
            } else {
                val newQuantity = currentQuantity.toInt() + 1
                editQuantityEgg?.setText(newQuantity.toString())
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as MainActivity).updateShoppingBasketVisibility()
        }

        //adicionar quantidade do chicken
        val textChickenPlus = view?.findViewById<TextView>(R.id.text_chicken_plus)
        val textChickenLess = view?.findViewById<TextView>(R.id.text_chicken_less)
        val editQuantityChicken = view?.findViewById<EditText>(R.id.edit_quantity_chicken)

        textChickenLess?.setOnClickListener {
            editQuantityChicken?.clearFocus()
            val currentQuantityString = editQuantityChicken?.text.toString()

            // verifica se o campo de texto não está vazio
            if (currentQuantityString.isNotEmpty()) {
                val currentQuantity = currentQuantityString.toInt()

                // verifica se a quantidade é maior que 1
                if (currentQuantity > 1) {
                    val newQuantity = currentQuantity - 1
                    editQuantityChicken?.setText(newQuantity.toString())
                } else {
                    // se a quantidade for 1 ou menor, limpa o campo de texto
                    editQuantityChicken?.setText("")
                }
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as MainActivity).updateShoppingBasketVisibility()
        }

        textChickenPlus?.setOnClickListener {
            editQuantityChicken?.clearFocus()
            //obtendo o valor do texto atual do editQuantityEgg
            val currentQuantity = editQuantityChicken?.text.toString()

            if(currentQuantity.isEmpty()) {
                editQuantityChicken?.setText("1")
            } else {
                val newQuantity = currentQuantity.toInt() + 1
                editQuantityChicken?.setText(newQuantity.toString())
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as MainActivity).updateShoppingBasketVisibility()
        }
        (activity as? MainActivity)?.updateShoppingBasketVisibility()
    }
    fun isQuantityNotEmpty(): Boolean {
        //puxando os edittext do xml
        val editQuantityBacon = view?.findViewById<EditText>(R.id.edit_quantity_bacon)
        val editQuantityEgg = view?.findViewById<EditText>(R.id.edit_quantity_egg)
        val editQuantityChicken = view?.findViewById<EditText>(R.id.edit_quantity_chicken)

        //retornando se os campos sao diferente de nulo ou brancos
        return !editQuantityBacon?.text.isNullOrBlank() ||
                !editQuantityEgg?.text.isNullOrBlank() ||
                !editQuantityChicken?.text.isNullOrBlank()
    }
}
