package com.tjlab.intentpractice_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.intentpractice_genie.databinding.ActivityEditNicknameBinding

class EditNicknameActivity : AppCompatActivity() {

    private lateinit var binding:ActivityEditNicknameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditNicknameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.okBtn
    }
}