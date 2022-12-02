package com.example.leamopengl.model

/**
 * author : ZhiXin.Li<br>
 * e-mail : lizhixin@gwell.com<br>
 * date   : 2021/12/7 15:05<br>
 * desc   :  <br>
 */
class RectLib {

    companion object {
        init {
            System.loadLibrary("rect-lib")
        }


        external fun init(): Boolean

        external fun resize(width: Int, height: Int)

        external fun step()

        external fun destroy()
    }
}