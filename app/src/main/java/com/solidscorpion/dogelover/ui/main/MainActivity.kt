package com.solidscorpion.dogelover.ui.main

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.solidscorpion.dogelover.DogeLoverViewModel
import com.solidscorpion.dogelover.R
import com.solidscorpion.dogelover.databinding.ActivityMainBinding
import com.solidscorpion.dogelover.ui.BaseActivity
import javax.inject.Inject


class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val contentView = R.layout.activity_main
    @Inject
    lateinit var viewModel: DogeLoverViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.data.observe(this, Observer<String> {
            Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
            binding.editText.text = null
        })
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = BaseAdapter(mutableListOf(), this)
        binding.button2.setOnClickListener {
            viewModel.search(binding.editText.text.toString())
        }
    }
}
