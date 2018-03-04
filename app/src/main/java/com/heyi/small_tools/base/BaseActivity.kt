package com.heyi.small_tools.base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.annotation.AnimRes
import android.support.annotation.LayoutRes
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.text.TextUtils
import android.view.View
import com.heyi.small_tools.R
import me.imid.swipebacklayout.lib.app.SwipeBackActivity
import org.jetbrains.anko.setContentView

/**
 * #### Activity的基类,封装一些基础功能;
 * @author Heyi
 * @since 1.0.0
 */
abstract class BaseActivity:SwipeBackActivity(){
    private val TAG:String=this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent?.let {
            parseIntent(it)
        }
        init()
    }

    /**
     * #### 解析Intent中携带的数据,空实现 ;
     */
    protected open fun parseIntent(intent: Intent,isFromNewIntent:Boolean = false){}

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.let {
            parseIntent(it,true)
        }
    }

    /**
     * #### 初始化数据 ;
     */
    protected abstract fun init()




    @AnimRes
    protected fun getTransitionEnterAnim() =R.anim.fragment_slide_left_in
    @AnimRes
    protected fun getTransitionOutAnim()= R.anim.fragment_slide_left_out
    @AnimRes
    protected fun getTransitionLeftInAnim()  = R.anim.anim_view_left_in
    @AnimRes
    protected fun getTransitionRightOutAnim() = R.anim.fragment_slide_right_out
    @AnimRes
    protected fun getViewTransitionInAnim() = R.anim.anim_view_in
    @AnimRes
    protected fun getViewTransitionRightOutAnim() = R.anim.anim_view_out

    override fun startActivity(intent: Intent) {
        super.startActivity(intent)
        overridePendingTransition(getTransitionEnterAnim(), getTransitionOutAnim())
    }

    override fun startActivityForResult(intent: Intent, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)
        overridePendingTransition(getTransitionEnterAnim(), getTransitionOutAnim())
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(getTransitionEnterAnim(), getTransitionRightOutAnim())
    }

    protected fun finishAndLeftOut(){
        finish()
        overridePendingTransition(getTransitionEnterAnim(), getTransitionOutAnim())

    }

    protected fun finishAndRightOut(){
        finish()
        overridePendingTransition(getTransitionEnterAnim(), getTransitionRightOutAnim())
    }
}