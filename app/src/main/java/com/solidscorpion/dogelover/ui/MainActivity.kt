package com.solidscorpion.dogelover.ui

import android.os.Bundle
import com.solidscorpion.dogelover.DogeLoverViewModel
import com.solidscorpion.dogelover.R
import com.solidscorpion.dogelover.databinding.ActivityMainBinding
import javax.inject.Inject


class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val contentView = R.layout.activity_main
    @Inject
    lateinit var viewModel: DogeLoverViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
