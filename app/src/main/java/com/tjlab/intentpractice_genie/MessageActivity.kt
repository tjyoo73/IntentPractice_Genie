package com.tjlab.intentpractice_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.intentpractice_genie.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentMessage = intent.getStringExtra("message")
        binding.receivedMessageTxt.text = intentMessage
    }
}