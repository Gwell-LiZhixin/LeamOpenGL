package com.example.leamopengl.model

/**
 *    author : Lizhixin
 *    e-mail : lizhixin@gwell.com
 *    date   : 2021/11/17 16:42
 *    desc   :
 */
class TriangleLib {
    companion object {
        /**
         * 初始化本地 GLES
         */
        external fun init(): Boolean

        /**
         * 为本地 GLES 设置宽和高
         */
        external fun resize(width: Int, height: Int)

        /**
         * 用来回执图形
         */
        external fun setp()

        init {
//            System.loadLibrary("triangle-lib")
        }
    }


}