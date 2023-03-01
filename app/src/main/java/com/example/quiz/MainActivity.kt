package com.example.quiz

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Question 1
        binding.tvQ1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val ans = arrayOf("Kotlin", "C", "Javascript", "Java")
            builder.setIcon(R.drawable.baseline_question_mark_24)
            builder.setTitle("Which language is used to create app?")
            builder.setSingleChoiceItems(ans, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You selected ${ans[i]}", Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->  })

            builder.show()
        }

        //Question 2
        binding.tvQ2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val ans = arrayOf("Scripting language", "Markup language", "Programming language", "SQL Query")
            builder.setIcon(R.drawable.baseline_question_mark_24)
            builder.setTitle("Whatis Kotlin?")
            builder.setSingleChoiceItems(ans, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You selected ${ans[i]}", Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->  })

            builder.show()
        }

        //Question 3
        binding.tvQ3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val ans = arrayOf("Pranab Mukherjee", "Pratibha Patil", "Droupadi Murmu", "Manmohan Singh")
            builder.setIcon(R.drawable.baseline_question_mark_24)
            builder.setTitle("Who is current president of India?")
            builder.setSingleChoiceItems(ans, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You selected ${ans[i]}", Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->  })

            builder.show()
        }

        //Question 4
        binding.tvQ4.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val ans = arrayOf("Qutar", "Dubai", "Sharjah", "Abu Dhabi")
            builder.setIcon(R.drawable.baseline_question_mark_24)
            builder.setTitle("what is the capital city of UAE?")
            builder.setSingleChoiceItems(ans, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You selected ${ans[i]}", Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->  })

            builder.show()
        }

        //Exit button
        binding.imgExit.setOnClickListener {
            finish()
        }
    }
}