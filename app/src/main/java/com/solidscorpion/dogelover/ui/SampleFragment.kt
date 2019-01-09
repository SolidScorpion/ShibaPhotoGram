package com.solidscorpion.dogelover.ui


import android.os.Bundle
import android.view.View
import com.solidscorpion.dogelover.R
import com.solidscorpion.dogelover.databinding.FragmentSampleBinding

class SampleFragment : BaseFragment<FragmentSampleBinding>() {
    override val contentView = R.layout.fragment_sample

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
