package com.example.clinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View  // Needed for Button click listener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authorization)

        // Find the button by its ID
        val entranceButton = findViewById<Button>(R.id.entrance)

        // Set onClickListener for the button
        entranceButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create an Intent to launch the PersonalInfoActivity
                val intent = Intent(this@MainActivity, PersonalInfoActivity::class.java)

                // Start the activity
                startActivity(intent)
            }
        })
    }
}