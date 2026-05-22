package com.example.grocery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        findViewById<Button>(R.id.btnAddGood).setOnClickListener {
            startActivity(Intent(this, AddGoodActivity::class.java))
        }
        findViewById<Button>(R.id.btnAddSale).setOnClickListener {
            startActivity(Intent(this, AddSaleActivity::class.java))
        }
        findViewById<Button>(R.id.btnReports).setOnClickListener {
            startActivity(Intent(this, ReportsActivity::class.java))
        }
        findViewById<Button>(R.id.btnDebt).setOnClickListener {
            startActivity(Intent(this, DebtActivity::class.java))
        }
    }
}
