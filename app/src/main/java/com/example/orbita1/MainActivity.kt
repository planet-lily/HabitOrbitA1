package com.example.orbita1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class MainActivity : AppCompatActivity() {





    //declarations
    private lateinit var tvResult: TextView
    private lateinit var edtTime: EditText
    private lateinit var btnSuggestions: Button
    private lateinit var btnReset: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Step 2 : Initializing variables
        tvResult = findViewById(R.id.tvResult)
        edtTime = findViewById(R.id.edtTime)
        btnSuggestions = findViewById(R.id.btnSuggestions)
        btnReset = findViewById(R.id.btnReset)
        textView = findViewById(R.id.textView)

        // step 3 button click listeners
        btnSuggestions.setOnClickListener {
           val time = edtTime.text.toString()

            if (edtTime.text.isEmpty()
                ) {
                Toast.makeText(this, "Please enter the time of day", Toast.LENGTH_SHORT).show()
return@setOnClickListener
            }

            // Decision logic

            if ( time == "Morning"){
                textView.text = "Send a Good morning text to a family memeber"

            }
            else if (time == "Mid-Morning"){
                textView.text = "Reach out to a collegue with a quick Thank You"

            }
            else if ( time == "Afternoon"){
              textView.text = "Share  a funny meme or interesting link with a friend"

            }
            else if ( time == "Afternoon Snack Time "){
                textView.text = "Send a quick 'thinking of you message' "

            }
            else if ( time == "Dinner"){
                textView.text = "Call a friend or relative for 5 minutes "

            }
            else if ( time == "After Dinner / Night"){
                textView.text = "Leave a thoughtful comment on a friends post"
            }
            else {
                textView.text=
                    "Please enter one of the following : Morning,Mid-Morning,Afternoon,Afternoon Snack Time,Dinner,After Dinner / Night"

            }

            //Step 4 reset button
            btnReset.setOnClickListener {
                edtTime.text.clear()
                textView.text = "Social Spark Suggestion"

            }



        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}