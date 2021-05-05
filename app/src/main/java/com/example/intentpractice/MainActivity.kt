package com.example.intentpractice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pgWeb ( view: View) = startActivity(
        Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.linkedin.com/in/matias-folonier-6797a3b5/")
        )
    )
    fun callPhone ( view: View) = startActivity(
        Intent(
            Intent.ACTION_DIAL,
            Uri.parse("tel:+447598060340")
        )
    )
    fun googleMaps (view: View) = startActivity (
        Intent(
            Intent.ACTION_VIEW,
            Uri.parse("geo:51.5074,0.1278")
        )
    )
    fun takePic (view: View) = startActivity (
        Intent(
           MediaStore.ACTION_IMAGE_CAPTURE
        )
    )
    fun sendMail (view: View) = startActivity (
        Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT,
                    "asunto"
            )
            putExtra(Intent.EXTRA_TEXT,
                    "Texto del correo"
            )
            putExtra(Intent.EXTRA_EMAIL,
                    arrayOf("mfolonier3@gmail.com")
            )
        }
    )

}