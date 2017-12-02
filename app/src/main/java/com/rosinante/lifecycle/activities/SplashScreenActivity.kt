package com.rosinante.lifecycle.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.rosinante.lifecycle.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen_activity)
        // Handler sebagai pemberi jarak waktu untuk pemrosesan,
        // disini dipakai sebagau pemberi jarak waktu saat berpindah halaman ke halaman utama
        Handler().postDelayed({
            //method startActivity() sebagai sarana berpindah activity sebelumnya ke activity yang akan dituju
            startActivity(Intent(this@SplashScreenActivity, MenuUtama::class.java))
            //angka dibawah ini sebagai acuan waktu jarak perpindahan activitynya, disini saya pasang 3000 atau 3 detik
        }, 3000)
    }

}
