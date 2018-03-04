package com.heyi.small_tools

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.support.multidex.MultiDex
import com.heyi.small_tools.skin.SkinManager

/**
 * @author Heyi
 * @since 1.0.0
 */
class SmallToolsApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        SkinManager.init()
    }
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        if (newConfig?.fontScale!=1f){
            getResources()
        }
        super.onConfigurationChanged(newConfig)
    }

    override fun getResources(): Resources {
        val resources = super.getResources()
        if (resources.configuration.fontScale!=1f){
            val configuration = Configuration()
            configuration.setToDefaults()
            resources.updateConfiguration(configuration,resources.displayMetrics)
        }
        return super.getResources()
    }

}