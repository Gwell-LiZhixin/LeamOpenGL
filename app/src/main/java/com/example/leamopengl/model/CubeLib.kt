package com.example.leamopengl.model

/**
 * author : ZhiXin.Li<br>
 * e-mail : lizhixin@gwell.com<br>
 * date   : 2021/12/8 14:11<br>
 * desc   :  <br>
 */
class CubeLib {

    companion object {

        external fun init(): Boolean

        external fun resize(width: Int, height: Int)

        external fun step()

        external fun destroy()
    }
}