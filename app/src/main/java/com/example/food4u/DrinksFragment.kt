package com.example.food4u

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class DrinksFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drinks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addQuantity()
    }

    private fun addQuantity() {

        //adicionar quantidade de coca
        val textCocaPlus = view?.findViewById<TextView>(R.id.text_coca_plus)
        val textCocaLess = view?.findViewById<TextView>(R.id.text_coca_less)
        val editQuantityCoca = view?.findViewById<EditText>(R.id.edit_quantity_coca)

        textCocaLess?.setOnClickListener {
            editQuantityCoca?.clearFocus()
            val currentQuantityString = editQuantityCoca?.text.toString()

            // verifica se o campo de texto não está vazio
            if (currentQuantityString.isNotEmpty()) {
                val currentQuantity = currentQuantityString.toInt()

                // verifica se a quantidade é maior que 1
                if (currentQuantity > 1) {
                    val newQuantity = currentQuantity - 1
                    editQuantityCoca?.setText(newQuantity.toString())
                } else {
                    // se a quantidade for 1 ou menor, limpa o campo de texto
                    editQuantityCoca?.setText("")
                }
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as? MainActivity)?.updateShoppingBasketVisibility()
        }

        textCocaPlus?.setOnClickListener {
            editQuantityCoca?.clearFocus()
            //obtendo o valor do texto atual do editQuantityBacon
            val currentQuantity = editQuantityCoca?.text.toString()

            if(currentQuantity.isEmpty()) {
                editQuantityCoca?.setText("1")
            } else {
                val newQuantity = currentQuantity.toInt() + 1
                editQuantityCoca?.setText(newQuantity.toString())
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as? MainActivity)?.updateShoppingBasketVisibility()
        }

        //adicionar quantidade de pepsi
        val textPepsiPlus = view?.findViewById<TextView>(R.id.text_pepsi_plus)
        val textPepsiLess = view?.findViewById<TextView>(R.id.text_pepsi_less)
        val editQuantityPepsi= view?.findViewById<EditText>(R.id.edit_quantity_pepsi)

        textPepsiLess?.setOnClickListener {
            editQuantityPepsi?.clearFocus()
            val currentQuantityString = editQuantityPepsi?.text.toString()

            // verifica se o campo de texto não está vazio
            if (currentQuantityString.isNotEmpty()) {
                val currentQuantity = currentQuantityString.toInt()

                // verifica se a quantidade é maior que 1
                if (currentQuantity > 1) {
                    val newQuantity = currentQuantity - 1
                    editQuantityPepsi?.setText(newQuantity.toString())
                } else {
                    // se a quantidade for 1 ou menor, limpa o campo de texto
                    editQuantityPepsi?.setText("")
                }
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as? MainActivity)?.updateShoppingBasketVisibility()
        }

        textPepsiPlus?.setOnClickListener {
            editQuantityPepsi?.clearFocus()
            //obtendo o valor do texto atual do editQuantityBacon
            val currentQuantity = editQuantityPepsi?.text.toString()

            if(currentQuantity.isEmpty()) {
                editQuantityPepsi?.setText("1")
            } else {
                val newQuantity = currentQuantity.toInt() + 1
                editQuantityPepsi?.setText(newQuantity.toString())
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as? MainActivity)?.updateShoppingBasketVisibility()
        }

        //adicionar quantidade de sprite
        val textSpritePlus = view?.findViewById<TextView>(R.id.text_sprite_plus)
        val textSpriteLess = view?.findViewById<TextView>(R.id.text_sprite_less)
        val editQuantitySprite = view?.findViewById<EditText>(R.id.edit_quantity_sprite)

        textSpriteLess?.setOnClickListener {
            editQuantitySprite?.clearFocus()
            val currentQuantityString = editQuantitySprite?.text.toString()

            // verifica se o campo de texto não está vazio
            if (currentQuantityString.isNotEmpty()) {
                val currentQuantity = currentQuantityString.toInt()

                // verifica se a quantidade é maior que 1
                if (currentQuantity > 1) {
                    val newQuantity = currentQuantity - 1
                    editQuantitySprite?.setText(newQuantity.toString())
                } else {
                    // se a quantidade for 1 ou menor, limpa o campo de texto
                    editQuantitySprite?.setText("")
                }
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as? MainActivity)?.updateShoppingBasketVisibility()
        }

        textSpritePlus?.setOnClickListener {
            editQuantitySprite?.clearFocus()
            //obtendo o valor do texto atual do editQuantityBacon
            val currentQuantity = editQuantitySprite?.text.toString()

            if(currentQuantity.isEmpty()) {
                editQuantitySprite?.setText("1")
            } else {
                val newQuantity = currentQuantity.toInt() + 1
                editQuantitySprite?.setText(newQuantity.toString())
            }
            // Atualiza a visibilidade da cesta de compras
            (activity as? MainActivity)?.updateShoppingBasketVisibility()
        }
    }

    fun isQuantityNotEmpty(): Boolean {
        //puxando os edittext do xml
        val editQuantityCoca = view?.findViewById<EditText>(R.id.edit_quantity_coca)
        val editQuantityPepsi = view?.findViewById<EditText>(R.id.edit_quantity_pepsi)
        val editQuantitySprite = view?.findViewById<EditText>(R.id.edit_quantity_sprite)

        //retornando se os campos sao diferente de nulo ou brancos
        return !editQuantityCoca?.text.isNullOrBlank() ||
                !editQuantityPepsi?.text.isNullOrBlank() ||
                !editQuantitySprite?.text.isNullOrBlank()
    }
}
