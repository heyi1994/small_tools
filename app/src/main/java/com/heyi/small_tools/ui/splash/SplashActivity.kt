package com.heyi.small_tools.ui.splash

import com.heyi.small_tools.R
import com.heyi.small_tools.base.BaseActivity
import com.heyi.small_tools.base.BaseUi
import com.heyi.small_tools.extends.transparentStatusBar
import org.jetbrains.anko.*

/**
 * @author Heyi
 * @since 1.0.0
 */
class SplashActivity :BaseActivity(){
    private val TAG:String=this.javaClass.simpleName
    lateinit private var  ui :SplashActivityUi
    override fun init() {
        setSwipeBackEnable(false)
        ui = SplashActivityUi(transparentStatusBar())
        ui.setContentView(this)

    }

    override fun onDestroy() {
        super.onDestroy()
        ui.onDestory()
    }

}

class SplashActivityUi(private val statusHeight:Int):BaseUi<SplashActivity>(){
    override fun createView(ui: AnkoContext<SplashActivity>)=
            with(ui){
                relativeLayout() {
                    setPadding(0,statusHeight,0,0)
                    setBackgroundResource(R.drawable.ic_splash)
                }
            }

}

