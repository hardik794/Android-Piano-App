package com.example.kids

import android.media.SoundPool
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_piano.*

class PianoActivity : AppCompatActivity() {
    lateinit var soundPool: SoundPool

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        @Suppress("DEPRECATION")
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_piano)

        soundPool = SoundPool.Builder().setMaxStreams(6).build()

        //white piano button sounds....
        var mw1 = soundPool.load(this,R.raw.d1,1)
        var mw2 = soundPool.load(this,R.raw.d2,1)
        var mw3 = soundPool.load(this,R.raw.d3,1)
        var mw4 = soundPool.load(this,R.raw.d4,1)
        var mw5 = soundPool.load(this,R.raw.d5,1)
        var mw6 = soundPool.load(this,R.raw.d6,1)
        var mw7 = soundPool.load(this,R.raw.d7,1)
        var mw8 = soundPool.load(this,R.raw.d8,1)
        var mw9 = soundPool.load(this,R.raw.d9,1)
        var mw10 = soundPool.load(this,R.raw.d10,1)
        var mw11 = soundPool.load(this,R.raw.d11,1)
        var mw12 = soundPool.load(this,R.raw.d12,1)

        w1.setOnClickListener {
            soundPool.play(mw1,1F, 1F,0,0, 1F)
        }

        w2.setOnClickListener {
            soundPool.play(mw2,1F, 1F,0,0, 1F)
        }
        w3.setOnClickListener {
            soundPool.play(mw3,1F, 1F,0,0, 1F)
        }
        w4.setOnClickListener {
            soundPool.play(mw4,1F, 1F,0,0, 1F)
        }
        w5.setOnClickListener {
            soundPool.play(mw5,1F, 1F,0,0, 1F)
        }
        w6.setOnClickListener {
            soundPool.play(mw6,1F, 1F,0,0, 1F)
        }
        w7.setOnClickListener {
            soundPool.play(mw7,1F, 1F,0,0, 1F)
        }
        w8.setOnClickListener {
            soundPool.play(mw8,1F, 1F,0,0, 1F)
        }
        w9.setOnClickListener {
            soundPool.play(mw9,1F, 1F,0,0, 1F)
        }
        w10.setOnClickListener {
            soundPool.play(mw10,1F, 1F,0,0, 1F)
        }
        w11.setOnClickListener {
            soundPool.play(mw11,1F, 1F,0,0, 1F)
        }
        w12.setOnClickListener {
            soundPool.play(mw12,1F, 1F,0,0, 1F)
        }

        //black piano button sounds....

        var mb1 = soundPool.load(this,R.raw.t1,1)
        var mb2 = soundPool.load(this,R.raw.t2,1)
        var mb3 = soundPool.load(this,R.raw.t3,1)
        var mb4 = soundPool.load(this,R.raw.t4,1)
        var mb5 = soundPool.load(this,R.raw.t5,1)
        var mb6 = soundPool.load(this,R.raw.t6,1)
        var mb7 = soundPool.load(this,R.raw.t7,1)
        var mb8 = soundPool.load(this,R.raw.t8,1)
        var mb9 = soundPool.load(this,R.raw.t9,1)

        b1.setOnClickListener {
            soundPool.play(mb1,1F, 1F,0,0, 1F)
        }
        b2.setOnClickListener {
            soundPool.play(mb2,1F, 1F,0,0, 1F)
        }
        b3.setOnClickListener {
            soundPool.play(mb3,1F, 1F,0,0, 1F)
        }
        b4.setOnClickListener {
            soundPool.play(mb4,1F, 1F,0,0, 1F)
        }
        b5.setOnClickListener {
            soundPool.play(mb5,1F, 1F,0,0, 1F)
        }
        b6.setOnClickListener {
            soundPool.play(mb6,1F, 1F,0,0, 1F)
        }
        b7.setOnClickListener {
            soundPool.play(mb7,1F, 1F,0,0, 1F)
        }
        b8.setOnClickListener {
            soundPool.play(mb8,1F, 1F,0,0, 1F)
        }
        b9.setOnClickListener {
            soundPool.play(mb9,1F, 1F,0,0, 1F)
        }

        //back pressed event
        piano_home.setOnClickListener {
            super.onBackPressed()
        }

    }
}