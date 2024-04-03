package com.example.food4u

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.food4u.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {}
/*
    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
 override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    // Inflate the layout for this fragment
    _binding = FragmentCategoryBinding.inflate(inflater, container, false)
    return binding.root
}

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    // Adicionar OnClickListener aos TextViews
    binding.textSnack.setOnClickListener {
        showFragment(binding.fragmentContainerSnack)
    }
    binding.textDrink.setOnClickListener {
        showFragment(binding.fragmentContainerDrinks)
    }
    // Adicione manipuladores de clique para outros TextViews conforme necessário
}

private fun showFragment(fragment: View) {
    // Definir a visibilidade dos fragmentos
    binding.fragmentContainerSnack.visibility = if (fragment == binding.fragmentContainerSnack) View.VISIBLE else View.INVISIBLE
    binding.fragmentContainerDrinks.visibility = if (fragment == binding.fragmentContainerDrinks) View.VISIBLE else View.INVISIBLE
    // Defina a visibilidade de outros fragmentos conforme necessário
}

}*/