package com.example.leamopengl

import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leamopengl.view.RectView

/**
 * author : ZhiXin.Li<br>
 * e-mail : lizhixin@gwell.com<br>
 * date   : 2021/12/7 15:06<br>
 * desc   :  <br>
 */
class RectActivity : AppCompatActivity() {
    lateinit var view: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = RectView(this)
        setContentView(view)
    }

    override fun onResume() {
        super.onResume()
        view.onResume()
    }

    override fun onPause() {
        super.onPause()
        view.onPause()
    }
}