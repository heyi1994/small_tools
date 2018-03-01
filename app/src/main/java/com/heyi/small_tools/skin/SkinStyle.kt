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

    /**
     * 状态栏
     */
    @ColorInt
     var mStatusColor:Int

    /**
     * 纯色ViewGroup(除白色等浅色)
     */
    @ColorInt
     var mColorFrameBg:Int

    /**
     * 纯色ViewGroup(除白色等浅色)中文字颜色
     */
    @ColorInt
     var mColorFrameTextColor:Int

    /**
     * 纯色ViewGroup(除白色等浅色)中副标题文字颜色
     */
    @ColorInt
     var mColorFrameSecondTextColor:Int

    /**
     * 白色等浅色ViewGroup中文字颜色
     */
    @ColorInt
     var mWhiteFrameTextColor:Int

    /**
     * 白色等浅色ViewGroup中副标题文字颜色
     */
    @ColorInt
     var mWhiteFrameSecondTextColor:Int

    /**
     * 该主题标题
     */
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