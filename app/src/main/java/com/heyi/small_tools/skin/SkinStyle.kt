package com.heyi.small_tools.skin

import android.support.annotation.ColorInt
import com.heyi.small_tools.skin.style.PinkSkinStyle
/**
 * #### 皮肤样式 ;
 *   - 默认为粉红样式 ;
 *
 * @author Heyi
 * @since 1.0.0
 */
class SkinStyle private constructor(private val builder: Builder){
    @ColorInt
     var mStatusColor:Int

    @ColorInt
     var mColorFrameBg:Int

    @ColorInt
     var mColorFrameTextColor:Int

    @ColorInt
     var mColorFrameSecondTextColor:Int

    @ColorInt
     var mWhiteFrameTextColor:Int

    @ColorInt
     var mWhiteFrameSecondTextColor:Int

     var mThemeTitle:String
    init {

        mStatusColor = builder.getStatusColor()?: PinkSkinStyle.STATUS_COLOR
        mColorFrameBg = builder.getColorFrameBg()?: PinkSkinStyle.COLOR_FRAME_BG
        mColorFrameTextColor = builder.getColorFrameTextColor()?: PinkSkinStyle.COLOR_FRAME_TEXT_COLOR
        mColorFrameSecondTextColor = builder.getColorFrameSecondTextColor()?: PinkSkinStyle.COLOR_FRAME_SECOND_TEXT_COLOR
        mWhiteFrameTextColor = builder.getWhiteFrameTextColor()?: PinkSkinStyle.WHITE_FRAME_TEXT_COLOR
        mWhiteFrameSecondTextColor = builder.getWhiteFrameSecondTextColor()?: PinkSkinStyle.WHITE_FRAME_SECOND_TEXT_COLOR
        mThemeTitle = builder.getThemeTitle()?: PinkSkinStyle.THEME_TITLE
    }

     class Builder{
        @ColorInt
        private var mStatusColor:Int? =null

        @ColorInt
        private var mColorFrameBg:Int?=null

         @ColorInt
         private var mColorFrameTextColor:Int?=null

         @ColorInt
         private var mColorFrameSecondTextColor:Int?=null

        @ColorInt
        private var mWhiteFrameTextColor:Int?=null

        @ColorInt
        private var mWhiteFrameSecondTextColor:Int?=null

        private var mThemeTitle:String?=null


        /**设置状态栏颜色**/
        fun setStatusColor(@ColorInt color:Int): Builder {
            mStatusColor = color
            return  this
        }

         fun getStatusColor() = mStatusColor

        /**设置有颜色的ViewGroup颜色**/
        fun setColorFrameBg(@ColorInt color: Int): Builder {
            mColorFrameBg = color
            return this
        }
         fun getColorFrameBg() = mColorFrameBg

        /**设置有颜色的ViewGroup中字体的颜色**/
        fun setColorFrameTextColor(@ColorInt color: Int): Builder {
            mColorFrameTextColor = color
            return this
        }
         fun getColorFrameTextColor() = mColorFrameTextColor

         /**设置有颜色的ViewGroup中副标题字体的颜色**/
         fun setColorFrameSecondTextColor(@ColorInt color: Int): Builder {
             mColorFrameSecondTextColor = color
             return this
         }

         fun getColorFrameSecondTextColor() = mColorFrameSecondTextColor

        /**设置白色等浅色ViewGroup的字体颜色**/
        fun setWhiteFrameTextColor(@ColorInt color: Int): Builder {
            mWhiteFrameTextColor = color
            return this
        }

         fun getWhiteFrameTextColor() = mWhiteFrameTextColor

         /**设置白色等浅色ViewGroup的副标题的颜色**/
        fun setWhiteFrameSecondTextColor(@ColorInt color: Int): Builder {
             mWhiteFrameSecondTextColor =color
            return this
        }
         fun getWhiteFrameSecondTextColor() = mWhiteFrameSecondTextColor

         /**设置该主题的标题**/
        fun setThemeTitle(title:String): Builder {
            mThemeTitle =title
            return  this
        }
         fun getThemeTitle() = mThemeTitle


        fun build() = SkinStyle(this)
    }
}