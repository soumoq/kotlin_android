package com.example.kotlintutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_toast.setOnClickListener {
            toast("Button click")
            val intent = Intent(this, SecandActivity::class.java).apply {
                putExtra("key", "key")
            }
            startActivity(intent)

        }
    }

    private fun toast(params: String) {
        Toast.makeText(this, params, Toast.LENGTH_LONG).show()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        toast("Exit")
    }
}
