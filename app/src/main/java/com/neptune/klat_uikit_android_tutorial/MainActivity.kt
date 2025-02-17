package com.neptune.klat_uikit_android_tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.neptune.klat_uikit_android.KlatUiKit
import com.neptune.klat_uikit_android.model.LoginRequest
import com.neptune.klat_uikit_android_tutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnConnect.setOnClickListener {
            KlatUiKit.connect(
                activity = this,
                oneToOneChannelId = null,
                loginRequest = LoginRequest(
                    userId = binding.etUserId.text.toString(),
                    userNickname = binding.etUserNickname.text.toString()
                )
            )
        }
    }
}