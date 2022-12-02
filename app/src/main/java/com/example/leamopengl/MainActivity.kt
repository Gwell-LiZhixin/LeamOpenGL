package com.example.leamopengl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_drawTriangle).setOnClickListener {
            val intent = Intent(this, TriangleActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_drawRectangle).setOnClickListener {
            val intent = Intent(this, RectActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_drawCube).setOnClickListener {
            val intent = Intent(this, CubeActivity::class.java)
            startActivity(intent)
        }
    }

}