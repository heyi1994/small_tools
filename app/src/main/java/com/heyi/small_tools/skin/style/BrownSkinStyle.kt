package com.heyi.small_tools.skin.style

import android.graphics.Color
import com.heyi.small_tools.skin.SkinStyle

/**
 * #### 棕色主题 ;
 * @author Heyi
 * @since 1.0.0
 */
object BrownSkinStyle {
    val STATUS_COLOR = Color.parseColor("#5D4037")
    val COLOR_FRAME_BG = Color.parseColor("#795548")
    val COLOR_FRAME_TEXT_COLOR = Color.parseColor("#FFFFFF")
    val COLOR_FRAME_SECOND_TEXT_COLOR = Color.parseColor("#D7CCC8")
    val WHITE_FRAME_TEXT_COLOR = Color.parseColor("#212121")
    val WHITE_FRAME_SECOND_TEXT_COLOR = Color.parseColor("#757575")
    val THEME_TITLE = "Brown"

    fun create(): SkinStyle {
        return SkinStyle.Builder().apply {
            setStatusColor(STATUS_COLOR)
            setColorFrameBg(COLOR_FRAME_BG)
            setColorFrameTextColor(COLOR_FRAME_TEXT_COLOR)
            setColorFrameSecondTextColor(COLOR_FRAME_SECOND_TEXT_COLOR)
            setWhiteFrameTextColor(WHITE_FRAME_TEXT_COLOR)
            setWhiteFrameSecondTextColor(WHITE_FRAME_SECOND_TEXT_COLOR)
            setThemeTitle(THEME_TITLE)
        }.build()
    }
}