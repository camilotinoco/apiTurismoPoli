package com.example.guiadeviajekotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.guiadeviajekotlin.databinding.FragmentItinerarioBinding

class ItinerarioFragment : Fragment() {

    private var _binding: FragmentItinerarioBinding? = null
    private val binding get() = _binding!!

    private var descripcionVisible1 = false
    private var descripcionVisible2 = false
    private var descripcionVisible3 = false
    private var descripcionVisible4 = false
    private var descripcionVisible5 = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItinerarioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.layoutFoto1.setOnClickListener {
            descripcionVisible1 = !descripcionVisible1
            binding.txtDesc1.text = if (descripcionVisible1) {
                "Cartagena - Ciudad amurallada: Un recorrido por las calles coloniales llenas de historia, arquitectura colonial y el encanto del Caribe colombiano."
            } else {
                "Toca para ver descripción"
            }
        }

        binding.layoutFoto2.setOnClickListener {
            descripcionVisible2 = !descripcionVisible2
            binding.txtDesc2.text = if (descripcionVisible2) {
                "Eje Cafetero: Paisajes verdes infinitos de plantaciones de café, el aroma del café fresco y la cultura cafetera de Colombia."
            } else {
                "Toca para ver descripción"
            }
        }

        binding.layoutFoto3.setOnClickListener {
            descripcionVisible3 = !descripcionVisible3
            binding.txtDesc3.text = if (descripcionVisible3) {
                "San Andrés: Aguas cristalinas en siete colores, playas paradisíacas y la cultura isleña única del Caribe colombiano."
            } else {
                "Toca para ver descripción"
            }
        }

        binding.layoutFoto4.setOnClickListener {
            descripcionVisible4 = !descripcionVisible4
            binding.txtDesc4.text = if (descripcionVisible4) {
                "Bogotá - Monserrate: Vista panorámica de la capital desde 3,152 metros de altura, un santuario con historia y tradición."
            } else {
                "Toca para ver descripción"
            }
        }

        binding.layoutFoto5.setOnClickListener {
            descripcionVisible5 = !descripcionVisible5
            binding.txtDesc5.text = if (descripcionVisible5) {
                "Tayrona: Parque Nacional Natural con playas vírgenes, selva tropical y vestigios de la cultura indígena Tayrona."
            } else {
                "Toca para ver descripción"
            }
        }
    }
}
