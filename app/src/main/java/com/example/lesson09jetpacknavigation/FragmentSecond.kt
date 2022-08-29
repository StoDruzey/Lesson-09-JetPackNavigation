package com.example.lesson09jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.lesson09jetpacknavigation.databinding.FragmentSecondBinding

class FragmentSecond : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = requireNotNull(_binding)
//exists a delegate for transferring arguments: navArgs. We need to parametrize it with the name of destination fragment: FragmentSecondArgs
    private val args by navArgs<FragmentSecondArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentSecondBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = args.text.toString() + args.value
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}