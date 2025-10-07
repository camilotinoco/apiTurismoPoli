package com.example.guiadeviajekotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.guiadeviajekotlin.databinding.FragmentRecomendacionesBinding

class RecomendacionesFragment : Fragment() {

    private var _binding: FragmentRecomendacionesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecomendacionesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar el WebView
        val webView = binding.webView
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        binding.buttonCargar.setOnClickListener {
            var url = binding.editTextUrl.text.toString().trim()
            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                url = "https://$url"
            }
            webView.loadUrl(url)
        }
        webView.loadUrl("https://www.colombia.travel/es")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
