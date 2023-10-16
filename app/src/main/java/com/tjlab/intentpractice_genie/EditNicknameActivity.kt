package com.tjlab.intentpractice_genie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.intentpractice_genie.databinding.ActivityEditNicknameBinding

class EditNicknameActivity : AppCompatActivity() {

    private lateinit var binding:ActivityEditNicknameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditNicknameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.okBtn.setOnClickListener {
            val inputNewNickname = binding.newNicknameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickname)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}