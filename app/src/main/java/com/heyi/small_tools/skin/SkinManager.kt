package com.heyi.small_tools.skin

import android.util.Log
import com.heyi.small_tools.skin.style.*
import kotlin.properties.Delegates


/**
 * #### 皮肤管理
 * @author Heyi
 * @since 1.0.0
 */
object SkinManager {
      private val TAG:String=this.javaClass.simpleName
      private var mSkins :MutableList<SkinStyle>
       init {
           Log.d(TAG,"init")
           mSkins = mutableListOf(
                   PinkSkinStyle.create(),
                   AmberSkinStyle.create(),
                   BlueGreySkinStyle.create(),
                   BlueSkinStyle.create(),
                   BrownSkinStyle.create(),
                   CyanSkinStyle.create(),
                   DeepOrangeSkinStyle.create(),
                   DeepPurpleSkinStyle.create(),
                   GreenSkinStyle.create(),
                   IndigoSkinStyle.create(),
                   LightBlueSkinStyle.create(),
                   LightGreenSkinStyle.create(),
                   LimeSkinStyle.create(),
                   OrangeSkinStyle.create(),
                   PurpleSkinStyle.create(),
                   RedSkinStyle.create(),
                   TealSkinStyle.create()
           )

       }

      var mCurrentSkin:SkinStyle by Delegates.observable(
              mSkins[0]
      ){
          property,oldValue,newValue->
          Log.d(TAG,"The propertyName is ${property.name} ; \n The oldValue's theme title is ${oldValue.mThemeTitle}" +
                  "\n The newValue's theme title is ${newValue.mThemeTitle}")
      }


    lateinit private var mSkinListeners:MutableMap<String,SkinStyleListener>


    fun init(){
        Log.d(TAG,"init method !")
        mSkinListeners = mutableMapOf()
    }

    /**
     * 添加一个主题更改监听 ;
     * @param key The Listener's className ; eg : this.javaClass.name
     */
    fun addSkinStyleListener(key:String,l:SkinStyleListener) = mSkinListeners.put(key,l)

    fun removeSkinStyleListener(key: String) = mSkinListeners.remove(key)


    fun clear() = mSkinListeners.clear()



}