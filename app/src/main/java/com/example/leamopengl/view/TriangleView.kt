package com.example.leamopengl.view

import android.content.Context
import android.opengl.GLSurfaceView
import com.example.leamopengl.model.TriangleLib
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 *    author : Lizhixin
 *    e-mail : lizhixin@gwell.com
 *    date   : 2021/11/17 16:41
 *    desc   :
 */
class TriangleView(context: Context) : GLSurfaceView(context) {
    init {
        setEGLConfigChooser(8, 8, 8, 0, 16, 0)
        // 指定了EL的版本，这里指定为了3
        setEGLContextClientVersion(3)
        setRenderer(TriangleRender())
    }

    class TriangleRender : Renderer {
        override fun onDrawFrame(gl: GL10?) {
            TriangleLib.setp()
        }

        override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
            TriangleLib.resize(width, height)
        }

        override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
            TriangleLib.init()
        }

    }
}