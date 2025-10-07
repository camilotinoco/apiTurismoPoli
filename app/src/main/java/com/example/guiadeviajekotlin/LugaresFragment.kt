package com.example.guiadeviajekotlin.fragments

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.Fragment
import com.example.guiadeviajekotlin.databinding.FragmentLugaresBinding

class LugaresFragment : Fragment() {

    private var _binding: FragmentLugaresBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLugaresBinding.inflate(inflater, container, false)


        val videoPath = "android.resource://${requireContext().packageName}/raw/video"
        val uri = Uri.parse(videoPath)
        binding.videoView.setVideoURI(uri)


        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
