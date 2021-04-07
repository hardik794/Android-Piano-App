package com.example.kids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("DEPRECATION")
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        val animation =AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val animationmiddle =AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        FirstLine.startAnimation(animation)
        SecondLine.startAnimation(animation)
        ThirdLine.startAnimation(animation)
        ForthLine.startAnimation(animation)
        FifthLine.startAnimation(animation)
        SixthLine.startAnimation(animation)
        SeventhLine.startAnimation(animation)
        EightthLine.startAnimation(animation)
        sun.startAnimation(animationmiddle)

        @Suppress("DEPRECATION")
        handler = Handler()
        handler.postDelayed({
            val intent =Intent(this,PianoActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}