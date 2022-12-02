package com.example.leamopengl.view

import android.content.Context
import android.opengl.GLSurfaceView
import com.example.leamopengl.model.CubeLib
import com.example.leamopengl.model.RectLib
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * author : ZhiXin.Li<br>
 * e-mail : lizhixin@gwell.com<br>
 * date   : 2021/12/8 14:11<br>
 * desc   :  <br>
 */
class CubeView(context: Context) : GLSurfaceView(context) {
    init {
        setEGLConfigChooser(8, 8, 8, 0, 16, 0)
        setEGLContextClientVersion(3)
        setRenderer(RectRender())
    }

    override fun onPause() {
        CubeLib.destroy()
        super.onPause()
    }

    class RectRender : Renderer {
        override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
            CubeLib.init()
        }

        override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
            CubeLib.resize(width, height)
        }

        override fun onDrawFrame(gl: GL10?) {
            CubeLib.step()
        }

    }
}