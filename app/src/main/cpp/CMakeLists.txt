# 这里指定了CMake的最低版本
cmake_minimum_required(VERSION 3.4.1)


#设置编译指令
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -fno-rtti -fno-exceptions -Wall")

#如果当前系统版本过低设置拒绝编译
if (${ANDROID_PLATFORM_LEVEL} LESS 11)
    message(FATAL_ERROR "OpenGL 2 is not supported before API level 11 (currently using ${ANDROID_PLATFORM_LEVEL}).")
    return()
elseif (${ANDROID_PLATFORM_LEVEL} LESS 18)
    add_definitions("-DDYNAMIC_ES3")
    set(OPENGL_LIB GLESv2)
else ()
    set(OPENGL_LIB GLESv3)
endif (${ANDROID_PLATFORM_LEVEL} LESS 11)

# 这里用来添加一个库
add_library(
        # 这里设置so库的名称为 triangle-lib
#        triangle-lib
        rect-lib
        # 这里设置该库为共享
        SHARED
        # 这里是源文件的路径，可以有多个，最终这个源文件将被编译并打包进native-lib库。
        triangle-lib.cpp
        esUtil.cpp
        cube-lib.cpp
        rect-lib.cpp
)

# 这里用来查找一个库，并设置到路径变量中去
find_library(
        # 设置路径变量
        log-lib
        # 你希望CMake编译器加载的NDK函数库
        log)

# 将一个库关联到目标函数库中
target_link_libraries(
        # 目标函数库
#        triangle-lib
        rect-lib
        # 想要在目标函数库中使用的函数库，其中${路径变量}
        ${OPENGL_LIB}
        ${log-lib}
        android
        EGL
        m
)