package com.heyi.small_tools.extends

import android.annotation.TargetApi
import android.app.Activity
import android.os.Build
import android.os.PowerManager
import android.view.WindowManager

/**
 * @author Heyi
 * @since 1.0.0
 */
/**
 * #### 保持页面常亮 ; 更多实现方式参考[PowerManager] ;
 */
fun Activity.keepScreenOn(){
    window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
}

/**
 * #### 将状态栏设置为透明模式,并返回状态栏的高度 ;
 * @return 返回状态栏高度 ;
 */
@TargetApi(Build.VERSION_CODES.KITKAT)
fun Activity.transparentStatusBar():Int{
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        return  resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height","dimen","android"))
}