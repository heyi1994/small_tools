package com.heyi.small_tools.base

import android.util.Log
import android.view.View
import com.heyi.small_tools.skin.SkinManager
import com.heyi.small_tools.skin.SkinStyle
import com.heyi.small_tools.skin.SkinStyleListener
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext

/**
 * @author Heyi
 * @since 1.0.0
 */
abstract class BaseUi<T:BaseActivity>() :AnkoComponent<T>, SkinStyleListener {
    private val TAG:String = this.javaClass.simpleName

    init {
        SkinManager.addSkinStyleListener(this.javaClass.name,
                this)
    }

    /**空实现**/
    override fun onSkinChanged(new: SkinStyle) {

    }

    protected fun getCurrentSkin() = SkinManager.mCurrentSkin


    fun onDestory(){
        SkinManager.removeSkinStyleListener(this.javaClass.name)
    }

}