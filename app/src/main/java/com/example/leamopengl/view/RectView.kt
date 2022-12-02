package com.example.leamopengl.view

import android.content.Context
import android.opengl.GLSurfaceView
import com.example.leamopengl.model.RectLib
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * author : ZhiXin.Li<br></br>
 * e-mail : lizhixin@gwell.com<br></br>
 * date   : 2021/12/7 15:05<br></br>
 * desc   :  <br></br>
 */
class RectView(context: Context) : GLSurfaceView(context) {
    init {
        setEGLConfigChooser(8, 8, 8, 0, 16, 0)
        setEGLContextClientVersion(3)
        setRenderer(RectRender())
    }

    override fun onPause() {
        RectLib.destroy()
        super.onPause()
    }

    class RectRender : Renderer {
        override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
            RectLib.init()
        }

        override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
            RectLib.resize(width, height)
        }

        override fun onDrawFrame(gl: GL10?) {
            RectLib.step()
        }

    }
}