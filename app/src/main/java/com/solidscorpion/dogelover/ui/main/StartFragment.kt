package com.solidscorpion.dogelover.ui.main


import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.solidscorpion.dogelover.DogeLoverViewModel
import com.solidscorpion.dogelover.R
import com.solidscorpion.dogelover.databinding.FragmentStartBinding
import com.solidscorpion.dogelover.ui.BaseFragment
import javax.inject.Inject

class StartFragment : BaseFragment<FragmentStartBinding>() {
    override val contentView = R.layout.fragment_start
    @Inject
    lateinit var viewModel: DogeLoverViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.data.observe(this, Observer<String> {
            Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
            binding.editText.text = null
        })
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = BaseAdapter(mutableListOf(), requireContext())
        binding.button2.setOnClickListener {
            viewModel.search(binding.editText.text.toString())
        }
        binding.btnMoveNext.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_startFragment_to_sampleFragment)
        }
    }

}
