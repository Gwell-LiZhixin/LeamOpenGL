package com.example.leamopengl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leamopengl.view.TriangleView

/**
 *    author : Lizhixin
 *    e-mail : lizhixin@gwell.com
 *    date   : 2021/11/17 16:42
 *    desc   :
 */
class TriangleActivity : AppCompatActivity() {
    lateinit var triangleView: TriangleView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        triangleView = TriangleView(this)
        setContentView(triangleView)
    }

    override fun onPause() {
        super.onPause()
        triangleView.onPause()
    }

    override fun onResume() {
        super.onResume()
        triangleView.onResume()
    }
}